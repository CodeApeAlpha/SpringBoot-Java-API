//package com.community.custom;
//
//import com.community.enitity.Account;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
////import org.springframework.context.annotation.ComponentScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collection;
//import java.util.Collections;
//
//
//@Component
//public class CustomUserDetails implements UserDetails {
//
//    private Account account;
//
//    public CustomUserDetails(){
//        account=null;
//    }
//
//
//    public CustomUserDetails(Account account){
//        super();
//        this.account = account;
//    }
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Collections.singleton(new SimpleGrantedAuthority(account.getRole().toString()));
//    }
//
//    @Override
//    public String getPassword() {
//        return account.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return account.getUsername();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
