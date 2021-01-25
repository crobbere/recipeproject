package gipsy.springframework.recipeproject.repositories;

import gipsy.springframework.recipeproject.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
