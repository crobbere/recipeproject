package gipsy.springframework.recipeproject.repositories;

import gipsy.springframework.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


import java.util.Optional;

@Component
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
