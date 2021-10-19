package com.community.enitity.dtos;

import com.community.enitity.Account;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

// Role Object Act As A Means Of Validation Of The User Input End Point, For This Data Type.

@Data
public class RoleDto {

    @NotNull(message = "Username is null")
    @NotEmpty(message = "Username is empty")
    @NotBlank(message = "Username is blank")
    private String userName;

    @NotNull(message = "Account is null")
    @NotEmpty(message = "Account is empty")
    @NotBlank(message = "Account is blank")
    private Set<Account> account;

}
