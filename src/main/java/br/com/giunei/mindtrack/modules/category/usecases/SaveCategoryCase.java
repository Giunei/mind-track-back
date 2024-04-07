package br.com.giunei.mindtrack.modules.category.usecases;

import br.com.giunei.mindtrack.modules.category.CategoryEntity;
import br.com.giunei.mindtrack.modules.category.dto.CategoryDTO;
import br.com.giunei.mindtrack.modules.category.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveCategoryCase {

    @Autowired
    private CategoryRepository repo;

    public CategoryDTO execute(CategoryDTO categoryDTO) {
        return toCategoryDTO(repo.save(toCategoryEntity(categoryDTO)));
    }

    public CategoryDTO toCategoryDTO(CategoryEntity category) {
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }

    public CategoryEntity toCategoryEntity(CategoryDTO categoryDTO) {
        return CategoryEntity.builder()
                .id(categoryDTO.getId())
                .name(categoryDTO.getName())
                .build();
    }
}
