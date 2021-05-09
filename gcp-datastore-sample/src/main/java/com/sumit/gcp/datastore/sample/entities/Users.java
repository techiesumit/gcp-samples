package com.sumit.gcp.datastore.sample.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Users {
    private List<User> users;
}
