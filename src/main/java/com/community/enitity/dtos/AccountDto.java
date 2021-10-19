package com.community.enitity.dtos;

import com.community.enitity.Account;
import com.community.enitity.Role;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

// Account Object Act As A Means Of Validation Of The User Input End Point, For This Data Type.
@Data
public class AccountDto {

//    private Long id;
    @NotNull(message = "Username is null")
    @NotEmpty(message = "Username is empty")
    @NotBlank(message = "Username is blank")
    private String username;
    @NotNull(message = "Email is null")
    @NotEmpty(message = "Email is empty")
    @NotBlank(message = "Email is blank")
    private String email;
    @NotNull(message = "Password is null")
    @NotEmpty(message = "Password is empty")
    @NotBlank(message = "Password is blank")
    private String password;
    @NotNull(message = "Role is null")
    @NotEmpty(message = "Role is empty")
    @NotBlank(message = "Role is blank")
    private Role role;

    public Account toAccount(){
        return new Account()
            .setUsername(username)
            .setEmail(email)
            .setRole(role)
            .setPassword(password);
    }
}
