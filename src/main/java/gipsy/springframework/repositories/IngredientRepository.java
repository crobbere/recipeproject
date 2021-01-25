package gipsy.springframework.repositories;

import gipsy.springframework.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
