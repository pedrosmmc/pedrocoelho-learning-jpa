package com.pedrocoelho.learningjpa.repositories;

import com.pedrocoelho.learningjpa.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Optional<Category> findByDescription(String description);
}
