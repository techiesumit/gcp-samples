package com.sumit.gcp.datastore.service.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.cloud.spring.data.datastore.core.DatastoreTemplate;
import com.sumit.gcp.datastore.sample.entities.FreeBikeStatus;

@Service
public class UpsertServiceHandler {

    private DatastoreTemplate datastoreTemplate;

    @Autowired
    public UpsertServiceHandler(DatastoreTemplate datastoreTemplate)
    {
        this.datastoreTemplate = datastoreTemplate;
    }

    public int createFreeBikeStatus(FreeBikeStatus freeBikeStatus){
         datastoreTemplate.save(freeBikeStatus);
         return 1;
    }
}
