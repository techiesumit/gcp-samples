package com.sumit.gcp.datastore.service.handlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.cloud.spring.data.datastore.core.DatastoreTemplate;
import com.sumit.gcp.datastore.sample.entities.FreeBikeStatus;
import com.sumit.gcp.datastore.sample.entities.GBFS4;

@Service
public class DataRetrivalServiceHandler {
  private DatastoreTemplate datastoreTemplate;

  @Autowired
  public DataRetrivalServiceHandler(DatastoreTemplate datastoreTemplate) {
    this.datastoreTemplate = datastoreTemplate;
  }

  public List<FreeBikeStatus> retriveAllFreeBikestatus() {
   return (List<FreeBikeStatus>) datastoreTemplate.findAll(FreeBikeStatus.class);
  }
  public List<GBFS4> retriveAllGBFS4() {
    return (List<GBFS4>) datastoreTemplate.findAll(GBFS4.class);
  }
}
