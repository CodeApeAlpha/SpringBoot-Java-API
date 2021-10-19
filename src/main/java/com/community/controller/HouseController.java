package com.community.controller;

import com.community.enitity.Community;
import com.community.enitity.House;
import com.community.service.CommunityService;
import com.community.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Validated
public class HouseController {

        @Autowired
        private HouseService houseService;

        @Autowired
        private CommunityService communityService;


//      Get

        @GetMapping("/community/house")
        public List<House> getHouses(){
            return this.houseService.getAllHouses();
        }

        @GetMapping("/community/house/{H_ID}")
        public Optional<House> getHouseById(@PathVariable Long H_ID){
            return this.houseService.getHouseById(H_ID);
        }

//        @GetMapping("/community/{C_Id}/house/{H_Id}")
//        public List<House> getCommunityByCommunityId_HouseId(@PathVariable Long C_Id, @PathVariable Long H_Id){
//            return this.houseService.getCommunityByCommunityId_HouseId(C_Id,H_Id);
//        }

//---------------------------------------------------------------------------------------------------------------------------

//      Post
        @PostMapping("/community/house")
        public void postHouse(@RequestBody Community community){
            this.communityService.postCommunity(community);
        }
//---------------------------------------------------------------------------------------------------------------------------


//      Put
        @PutMapping("/community/house")
        public void putHouse(@RequestBody House house){
            this.houseService.updateHouse(house);
        }
//      Delete
        @DeleteMapping("/community{C_Id}/house/{H_Id}")
        public void deleteCommunity(@PathVariable Long Id){
            this.houseService.deleteHouseById(Id);
        }

}
