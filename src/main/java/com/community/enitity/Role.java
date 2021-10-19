package com.community.enitity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Role {
    @Id
    @GeneratedValue
    private Long Id;
    private String Username;
    @OneToMany(targetEntity = Account.class,mappedBy = "role",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Account> account;
}
