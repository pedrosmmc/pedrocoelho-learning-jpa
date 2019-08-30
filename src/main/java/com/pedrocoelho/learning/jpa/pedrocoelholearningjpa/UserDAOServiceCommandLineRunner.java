package com.pedrocoelho.learning.jpa.pedrocoelholearningjpa;

import com.pedrocoelho.learning.jpa.pedrocoelholearningjpa.entity.User;
import com.pedrocoelho.learning.jpa.pedrocoelholearningjpa.service.UserDAOService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        long userInsertedID = userDAOService.insert(user);
        log.info("New user created: " + user);
    }
}
