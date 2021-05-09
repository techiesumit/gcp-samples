package com.sumit.gcp.datastore.sample.entities;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "free_bike_status")
public class FreeBikeStatus {
    private Data data;
    @SerializedName("last_updated")
    private Long lastUpdated;
    private Long ttl;
}
