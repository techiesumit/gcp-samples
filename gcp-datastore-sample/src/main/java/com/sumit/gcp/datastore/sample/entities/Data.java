package com.sumit.gcp.datastore.sample.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Data {


    private En en;

    public En getEn() {
        return en;
    }

    public void setEn(En en) {
        this.en = en;
    }

}
