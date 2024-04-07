package br.com.giunei.mindtrack.modules.block.usecases;

import br.com.giunei.mindtrack.modules.block.BlockEntity;
import br.com.giunei.mindtrack.modules.block.dto.BlockDTO;
import br.com.giunei.mindtrack.modules.block.repositories.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FindByCategoryUseCase {

    @Autowired
    private BlockRepository repo;

    public List<BlockDTO> execute(UUID categoryID) {
        return repo.findByCategoryID(categoryID).stream().map(this::toBlockDTO).toList();
    }

    public BlockDTO toBlockDTO(BlockEntity block) {
        return BlockDTO.builder()
                .id(block.getId())
                .front(block.getFront())
                .back(block.getBack())
                .build();
    }
}
