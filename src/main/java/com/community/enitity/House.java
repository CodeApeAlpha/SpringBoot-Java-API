package com.community.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class House {
    @Id
    @GeneratedValue
    private Long Id;
    @Column(nullable = false)
    private String Owner;
    @Column(nullable = false)
    private String OccupantType;
    @Column(nullable = false)
    private String Address;
}
