package com.community.service;

import com.community.enitity.Community;
import com.community.repository.CommunityRepository;
import com.community.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommunityService {
    private final CommunityRepository communityRepository;

    @Autowired
    public CommunityService(CommunityRepository communityRepository) {
        this.communityRepository = communityRepository;
    }

//    Get community
    public Optional<Community> getCommunity(long id){
        return this.communityRepository.findById(id);
    }
//    Get all communities
    public List<Community> getAllCommunities(){
        return this.communityRepository.findAll();
    }

//    Post Community
    public void postCommunity(Community community){
        this.communityRepository.save(community);
    }

//    Update Community
    public void updateCommunity(Community community){
        this.communityRepository.save(community);
    }

//    Delete Community
    public void deleteCommunity(Community community){
        this.communityRepository.delete(community);
    }

}
