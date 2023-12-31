package com.example.bbback.model;

import com.example.bbback.template.AbstractEntity;
import com.example.bbback.template.Position;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.sql.Delete;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Master extends AbstractEntity {
    private Long salonId;
    private String name;
    @Enumerated
    private Position position;
    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true,cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private MasterImages image;
}
