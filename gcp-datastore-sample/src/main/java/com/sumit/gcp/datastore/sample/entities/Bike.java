package com.sumit.gcp.datastore.sample.entities;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Bike {

    @SerializedName("bike_id")
    private String bikeId;
    @SerializedName("is_disabled")
    private Long isDisabled;
    @SerializedName("is_reserved")
    private Long isReserved;

    private Double lat;

    private Double lon;

    private String name;
}