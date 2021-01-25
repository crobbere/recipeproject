package gipsy.springframework.recipeproject.repositories;

import gipsy.springframework.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
