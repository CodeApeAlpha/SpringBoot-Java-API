package com.community.repository;

import com.community.enitity.Community;
import com.community.enitity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseRepository extends JpaRepository<House,Long> {
    @Query(value = "SELECT * FROM Community C INNER JOIN House H ON H.community_house_fk=C.Id WHERE H.Id=?2 AND C.Id=?1",nativeQuery = true)
    List<House> getCommunityByCommunityId_HouseId(Long C_Id, Long H_Id);
}
