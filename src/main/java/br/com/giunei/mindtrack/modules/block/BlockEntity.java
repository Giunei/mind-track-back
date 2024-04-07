package br.com.giunei.mindtrack.modules.block;

import br.com.giunei.mindtrack.modules.category.CategoryEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CurrentTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "block")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String front;
    private String back;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CategoryEntity category;

    @Column(name = "category_id")
    private UUID categoryID;

    @CurrentTimestamp
    private LocalDateTime createdDate;
}
