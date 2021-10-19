package com.community.service;
import com.community.enitity.Community;
import com.community.enitity.House;
import com.community.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HouseService {
    private final HouseRepository houseRepository;

    @Autowired
    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public Optional<House> getHouseById(Long H_Id){
        return this.houseRepository.findById(H_Id);
    }
    //    Get house
    public List<House> getCommunityByCommunityId_HouseId(Long C_Id, Long H_Id){
        return this.houseRepository.getCommunityByCommunityId_HouseId(C_Id,H_Id);
    }
    //    Get all house
    public List<House> getAllHouses(){
        return this.houseRepository.findAll();
    }
    //    Update House
    public void updateHouse(House house){
        this.houseRepository.save(house);
    }
    //    Delete House
    public void deleteHouseById(Long Id){
        this.houseRepository.deleteById(Id);
    }
}
