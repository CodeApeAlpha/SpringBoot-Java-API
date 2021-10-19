package com.community.enitity;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Accessors(chain = true)
public class Community {
    @Id
    @GeneratedValue
    private Long Id;

    @Column(nullable = false)
    private String Name;


    @Column(nullable = false)
    private String Number;

    @Column(nullable = false)
    private String GeneralAddress;


    @OneToMany(targetEntity = House.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "community_house_fk",referencedColumnName = "Id")
    private List<House> house;

}
