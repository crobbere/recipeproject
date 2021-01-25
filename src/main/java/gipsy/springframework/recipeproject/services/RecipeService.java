package gipsy.springframework.recipeproject.services;

import gipsy.springframework.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
