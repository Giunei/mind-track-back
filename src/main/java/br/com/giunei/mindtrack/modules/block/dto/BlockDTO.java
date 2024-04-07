package br.com.giunei.mindtrack.modules.block.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class BlockDTO {

    private UUID id;
    private String front;
    private String back;

}
