package com.sumit.gcp.datastore.sample.entities;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Users {
    private List<User> users;
}
