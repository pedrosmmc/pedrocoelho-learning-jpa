package com.pedrocoelho.learningjpa.repositories;

import com.pedrocoelho.learningjpa.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe,Long> {
}
