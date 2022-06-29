package com.example.springbootdocker.database.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class MessageEntity {
    @Id
    Integer id;

    String text;

    public String getText() {
        return text;
    }
}
