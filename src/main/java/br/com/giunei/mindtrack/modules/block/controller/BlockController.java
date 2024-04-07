package br.com.giunei.mindtrack.modules.block.controller;

import br.com.giunei.mindtrack.modules.block.dto.BlockDTO;
import br.com.giunei.mindtrack.modules.block.usecases.FindByCategoryUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/blocks")
public class BlockController {

    @Autowired
    private FindByCategoryUseCase findByCategoryUseCase;

    @GetMapping(name = "/category/{categoryID}")
    public List<BlockDTO> findByCategory(@PathVariable UUID categoryID) {
        return findByCategoryUseCase.execute(categoryID);
    }
}
