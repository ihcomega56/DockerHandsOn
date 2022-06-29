package com.example.springbootdocker;

import com.example.springbootdocker.database.dao.MessagesDao;
import com.example.springbootdocker.database.entity.MessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {
    private final MessagesDao dao;

    @Autowired
    public SpringBootDockerApplication(MessagesDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/")
    public String home() {
        return dao.selectLatest().map(MessageEntity::getText).orElse("ななし");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }

}
