package com.example.springbootdocker;

import com.example.springbootdocker.database.dao.ProfilesDao;
import com.example.springbootdocker.database.entity.ProfileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {
    private final ProfilesDao dao;

    @Autowired
    public SpringBootDockerApplication(ProfilesDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/")
    public String home() {
        return dao.selectLatest().map(ProfileEntity::getName).orElse("ななし");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }

}
