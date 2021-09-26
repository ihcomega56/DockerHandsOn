package com.example.springbootdocker.database.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class ProfileEntity {
    @Id
    Integer id;

    String name;

    public String getName() {
        return name;
    }
}
