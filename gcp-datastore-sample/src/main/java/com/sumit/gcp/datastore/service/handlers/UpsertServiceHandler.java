package com.sumit.gcp.datastore.service.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.cloud.spring.data.datastore.core.DatastoreTemplate;
import com.sumit.gcp.datastore.sample.entities.FreeBikeStatus;
import com.sumit.gcp.datastore.sample.entities.GBFS4;

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
    public int createFreeBikeStatus(GBFS4 gbfs4){
        datastoreTemplate.save(gbfs4);
        return 1;
    }
}
