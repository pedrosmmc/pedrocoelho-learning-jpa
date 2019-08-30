package com.pedrocoelho.learning.jpa.pedrocoelholearningjpa.service;

import com.pedrocoelho.learning.jpa.pedrocoelholearningjpa.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository // means this is a class that interacts with the database
@Transactional // means this object will be in a database transaction
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user); // EntityManager only tracks objects that are persistence to it - Persistence Context
        return user.getId();
    }
}
