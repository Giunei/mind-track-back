package br.com.giunei.mindtrack.modules.category.usecases;

import br.com.giunei.mindtrack.modules.category.CategoryEntity;
import br.com.giunei.mindtrack.modules.category.dto.CategoryDTO;
import br.com.giunei.mindtrack.modules.category.repositories.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FindAllUseCaseTest {

    @Mock
    private CategoryRepository repo;

    @InjectMocks
    private FindAllUseCase findAllUseCase;

    @Test
    void must_list_all_tests() {
        CategoryEntity category1 = CategoryEntity.builder().name("test1").build();
        CategoryEntity category2 = CategoryEntity.builder().name("test2").build();
        when(repo.findAll()).thenReturn(List.of(category1, category2));

        List<CategoryDTO> categoryList = findAllUseCase.execute();
        assertFalse(categoryList.isEmpty());
        assertEquals(2, categoryList.size());
    }
}