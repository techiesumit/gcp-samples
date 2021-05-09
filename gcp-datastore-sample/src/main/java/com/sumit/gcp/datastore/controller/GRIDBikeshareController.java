package com.sumit.gcp.datastore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.gcp.datastore.sample.entities.FreeBikeStatus;
import com.sumit.gcp.datastore.service.handlers.DataRetrivalServiceHandler;
import com.sumit.gcp.datastore.service.handlers.UpsertServiceHandler;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/bikeshare")
public class GRIDBikeshareController {

  private DataRetrivalServiceHandler dataRetrivalServiceHandler;
  private UpsertServiceHandler upsertServiceHandler;

  @Autowired
  public GRIDBikeshareController(
      DataRetrivalServiceHandler dataRetrivalServiceHandler,
      UpsertServiceHandler upsertServiceHandler) {
    this.dataRetrivalServiceHandler = dataRetrivalServiceHandler;
    this.upsertServiceHandler = upsertServiceHandler;
  }

  @GetMapping(value = "/freebikestatus")
  @ResponseBody
  public ResponseEntity<?> freeBikeStatus() {
      return new ResponseEntity(dataRetrivalServiceHandler.retriveAllFreeBikestatus(), OK);
  }
    @PostMapping(value = "/freebikestatus", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<?> freeBikeStatus(@RequestBody FreeBikeStatus freeBikeStatusRequest) {
        return new ResponseEntity(upsertServiceHandler.createFreeBikeStatus(freeBikeStatusRequest), CREATED);
    }
}
