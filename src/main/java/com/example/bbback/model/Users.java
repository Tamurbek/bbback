package com.example.bbback.model;

import com.example.bbback.template.AbstractEntity;
import com.example.bbback.template.Position;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.transaction.annotation.Transactional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Users extends AbstractEntity {

    private String name;

    private String phoneNumber;

    private String district;

    private String address;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true,cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private UserImages userImage;

    private String userName;

    private String password;
    @Enumerated
    private Position position;
}
