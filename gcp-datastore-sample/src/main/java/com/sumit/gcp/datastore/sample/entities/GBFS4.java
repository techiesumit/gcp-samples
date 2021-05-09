package com.sumit.gcp.datastore.sample.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GBFS4 {
    private Data data;
    @SerializedName("last_updated")
    private Long lastUpdated;
    private Long ttl;
}
