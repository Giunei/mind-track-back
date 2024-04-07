package br.com.giunei.mindtrack.modules.block.repositories;

import br.com.giunei.mindtrack.modules.block.BlockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BlockRepository extends JpaRepository<BlockEntity, UUID> {

    List<BlockEntity> findByCategoryID(UUID categoryID);
}
