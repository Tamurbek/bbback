package com.example.bbback.model;

import com.example.bbback.template.AbstractEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SalonsProf extends AbstractEntity {
    private long usersId;

    private String brandName;

    private String address;

    private long rating;

    private long ratingNUmber;

    private String phoneNumber;

    private String aboutSalon;

    private String timeWork;

    private long viewCount;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true,cascade = CascadeType.ALL)
    private SalonImage profImage;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true,cascade = CascadeType.ALL)
    private Locations locations;
}
