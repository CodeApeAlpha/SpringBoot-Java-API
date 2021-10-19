//package com.community.controller;
//
//import com.community.enitity.Community;
//import com.community.service.CommunityService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class CommunityController {
//
//    @Autowired
//    private CommunityService communityService;
//
//    @PostMapping("/community")
//    public void postCommunity(@RequestBody Community community){
//        this.communityService.postCommunity(community);
//    }
//
//    @GetMapping("/community/{Id}")
//    public void getCommunity(@PathVariable Long Id){
//        this.communityService.getCommunity(Id);
//    }
//
//    @GetMapping("/community")
//    public void getCommunities(){
//        this.communityService.getAllCommunities();
//    }
//
//    @PutMapping("/community")
//    public void putCommunity(@RequestBody Community community){
//        this.communityService.updateCommunity(community);
//    }
//    @DeleteMapping("/community")
//    public void deleteCommunity(@RequestBody Community community){
//        this.communityService.deleteCommunity(community);
//    }
//}
