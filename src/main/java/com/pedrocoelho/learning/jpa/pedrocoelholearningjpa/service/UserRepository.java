package com.pedrocoelho.learning.jpa.pedrocoelholearningjpa.service;

import com.pedrocoelho.learning.jpa.pedrocoelholearningjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
