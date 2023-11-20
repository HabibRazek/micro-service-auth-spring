package com.habib.sprint5;

import com.habib.sprint5.entities.Role;
import com.habib.sprint5.entities.User;
import com.habib.sprint5.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Sprint5Application {

    public static void main(String[] args) {
        SpringApplication.run(Sprint5Application.class, args);
    }

/*
    @Autowired
    UserService userService;
    @PostConstruct
    void init_users() {
//ajouter les rôles
        userService.addRole(new Role(null,"ADMIN"));
        userService.addRole(new Role(null,"USER"));
//ajouter les users
        userService.saveUser(new User(null,"admin","123",true,null));
        userService.saveUser(new User(null,"nadhem","123",true,null));
        userService.saveUser(new User(null,"yassine","123",true,null));
//ajouter les rôles aux users
        userService.addRoleToUser("admin", "ADMIN");
        userService.addRoleToUser("admin", "USER");
        userService.addRoleToUser("hbib", "USER");
        userService.addRoleToUser("yassine", "USER");
    }
    */

    @Bean
    BCryptPasswordEncoder getBCE() {
        return new BCryptPasswordEncoder();
    }
}
