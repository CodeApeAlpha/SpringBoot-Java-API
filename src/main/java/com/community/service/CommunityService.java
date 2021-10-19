package com.community.service;

import com.community.enitity.Community;
import com.community.exception.CommunityResponseBody;
import com.community.repository.CommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
//                .stream().map(obj->new Community().setHouse(obj.getHouse()).setNumber(obj.getNumber()).setName(obj.getNumber()).setGeneralAddress(obj.getGeneralAddress())).collect(Collectors.toList());
    }

//    Get all communities
    public List<Community> getAllCommunities(){
        return this.communityRepository.findAll();
    }
    public Optional<Community> getCommunityByCommunityId_HouseId(@PathVariable Long C_Id, @PathVariable Long H_Id){
        return this.communityRepository.getCommunityByCommunityId_HouseId(C_Id,H_Id).stream().findFirst();
    }
//    Post Community
    public Community postCommunity(Community community){
        return this.communityRepository.save(community);
    }

//    Update Community
    public void updateCommunity(Community community){
        this.communityRepository.save(community);
    }

//    Delete Community
    public void deleteCommunity(Long Id){
        this.communityRepository.deleteById(Id);
    }

    public void deleteCommunities() {
        this.communityRepository.deleteAll();
    }
}
