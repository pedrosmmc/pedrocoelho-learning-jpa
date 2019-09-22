package com.pedrocoelho.learningjpa.services;

import com.pedrocoelho.learningjpa.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
