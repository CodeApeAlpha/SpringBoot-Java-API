package com.community.service;

import com.community.enitity.Account;
import com.community.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class AccountServiceImpl {

   private final AccountRepository accountRepository;
    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Collection<Account> findAll(){
        return  this.accountRepository.findAll();
   }

   public Optional<Account> findByUserId(long Id){
       return this.accountRepository.findById(Id);
   }

   public Account saveAccount(Account account){
       return this.accountRepository.save(account);
   }

    public void deleteAccount(Long Id){
        this.accountRepository.deleteById(Id);
    }

}
