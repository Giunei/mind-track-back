package br.com.giunei.mindtrack.modules.category.usecases;

import br.com.giunei.mindtrack.modules.category.CategoryEntity;
import br.com.giunei.mindtrack.modules.category.dto.CategoryDTO;
import br.com.giunei.mindtrack.modules.category.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllUseCase {

    @Autowired
    private CategoryRepository repo;

    public List<CategoryDTO> execute() {
        return repo.findAll().stream().map(this::toCategoryDTO).toList();
    }

    public CategoryDTO toCategoryDTO(CategoryEntity category) {
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}
