package com.community.service;

import com.community.enitity.Account;
import com.community.enitity.Role;
import com.community.repository.AccountRepository;
import com.community.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class RoleServiceImpl {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public Collection<Role> findAll(){
        return  this.roleRepository.findAll();
    }

    public Optional<Role> findByUserId(long Id){
        return this.roleRepository.findById(Id);
    }

    public Role saveAccount(Role role){
        return this.roleRepository.save(role);
    }

    public void deleteAccount(Long Id){
        this.roleRepository.deleteById(Id);
    }
}
