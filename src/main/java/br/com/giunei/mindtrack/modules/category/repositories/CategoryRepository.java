package br.com.giunei.mindtrack.modules.category.repositories;

import br.com.giunei.mindtrack.modules.category.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface CategoryRepository extends JpaRepository<CategoryEntity, UUID> {

}
