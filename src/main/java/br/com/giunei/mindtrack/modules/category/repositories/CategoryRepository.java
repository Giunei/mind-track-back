package br.com.giunei.mindtrack.modules.category.repositories;

import br.com.giunei.mindtrack.modules.category.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<CategoryEntity, UUID> {

}
