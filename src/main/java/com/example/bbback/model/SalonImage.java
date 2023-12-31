package com.example.bbback.model;

import com.example.bbback.template.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class SalonImage extends AbstractEntity{
    private Long id;
    private String originalName;
    private String contentType;
    private byte[] imageByte;
}
