package br.com.giunei.mindtrack.modules.category.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class CategoryDTO {

    private UUID id;
    private String name;
}
