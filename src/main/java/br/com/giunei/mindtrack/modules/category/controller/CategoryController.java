package br.com.giunei.mindtrack.modules.category.controller;

import br.com.giunei.mindtrack.modules.category.dto.CategoryDTO;
import br.com.giunei.mindtrack.modules.category.usecases.FindAllUseCase;
import br.com.giunei.mindtrack.modules.category.usecases.SaveCategoryCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private FindAllUseCase findAllUseCase;

    @Autowired
    private SaveCategoryCase saveCategoryCase;

    @GetMapping
    public List<CategoryDTO> findAll() {
        return findAllUseCase.execute();
    }

    @PostMapping
    public CategoryDTO save(@RequestBody CategoryDTO categoryDTO) {
        return saveCategoryCase.execute(categoryDTO);
    }
}
