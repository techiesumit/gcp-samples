package com.sumit.gcp.datastore.sample.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private String emailAddress;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Long userId;
}