//package com.community.custom;
//
//import com.community.enitity.Account;
//import com.community.repository.AccountRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomAccountDetailService implements UserDetailsService {
//
//    @Autowired
//    private AccountRepository accountRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        Account account=accountRepository.findByUsername(s);
//        if(account==null){
//            throw new UsernameNotFoundException("User Not Found");
//        }
//        return new CustomUserDetails(account);
//    }
//}
