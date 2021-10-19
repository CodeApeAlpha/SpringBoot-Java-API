package com.community.controller;
import com.community.enitity.Community;
import com.community.enitity.dtos.CommunityDto;
import com.community.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.Optional;

@Validated
@RestController

// Act a restfull Api with the necessary end point.
public class CommunityController {

//  The service class contains all the methods to perfom a opertion with data need
    private  final CommunityService communityService;

//  This is the constructor
    @Autowired
    public CommunityController(CommunityService communityService) {
        this.communityService = communityService;
    }

//______________________________________________________________________________________________________________
//  POST
//  Post mapping accepts valid community objects class only
    @PostMapping("/community")
    public ResponseEntity<Community> postCommunity(@Valid @RequestBody CommunityDto community){
        Community createCommunity=communityService.postCommunity(community.toCommunity());
        return new ResponseEntity<>(createCommunity,HttpStatus.CREATED);
    }
//______________________________________________________________________________________________________________
//  GET
//  Find Community by valid ID
    @GetMapping("/community/{Id}")
    public ResponseEntity<Optional<Community>> getCommunity( @PathVariable @Valid  @Min(value = 0) Long Id){
        Optional<Community> foundCommunity= this.communityService.getCommunity(Id);
        if(foundCommunity.isEmpty()){
            return new ResponseEntity<>(foundCommunity,HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Optional<Community>>(foundCommunity,HttpStatus.FOUND);

    }
//  Get all the Communities posted.
    @GetMapping("/community")
    public List<Community> getCommunities(){
        return this.communityService.getAllCommunities();
    }

//  Get Community and House by ID
    @GetMapping("/community/{C_Id}/house/{H_Id}")
    public Optional<Community> getCommunityByCommunityId_HouseId(@PathVariable Long C_Id, @PathVariable Long H_Id){
        return this.communityService.getCommunityByCommunityId_HouseId(C_Id,H_Id);
    }
//______________________________________________________________________________________________________________
// UPDATE

// Update a Community from the list
    @PutMapping("/community")
    public void putCommunity(@Valid @RequestBody CommunityDto community){
        this.communityService.updateCommunity(community.toCommunity());
    }
//______________________________________________________________________________________________________________
//DELETE

//  Delete Community by ID
    @DeleteMapping("/community/{Id}")
    public void deleteCommunity(@PathVariable Long Id){
        this.communityService.deleteCommunity(Id);
    }
//  Delete All Communities
    @DeleteMapping("/communities")
    public void deleteCommunities(){
        this.communityService.deleteCommunities();
    }
}
