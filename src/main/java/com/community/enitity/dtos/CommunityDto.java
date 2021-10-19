package com.community.enitity.dtos;

import com.community.enitity.Community;
import com.community.enitity.House;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.stream.Collectors;

// Community Object Act As A Means Of Validation Of The User Input End Point, For This Data Type.

@Validated
@Data
public class CommunityDto {


    @NotBlank(message = "Name is blank")
    @NotEmpty(message = "Name is empty")
    @NotNull(message = "Name is null")
    private String Name;

    @NotBlank(message = "Number is blank")
    @NotEmpty(message = "Number is empty")
    @NotNull(message = "Number is null")
    private String Number;

    @NotBlank(message = "GeneralAddress is blank")
    @NotEmpty(message = "GeneralAddress is empty")
    @NotNull(message = "GeneralAddress is null")
    private String GeneralAddress;

    @Valid
    @NotNull(message = "House is null")
    private List< @Valid HouseDto> house;

    public Community toCommunity(){
        List<House> houseList=house.stream().map(obj->new House().setOwner(obj.getOwner()).setAddress(obj.getAddress()).setOccupantType(obj.getOwner())).collect(Collectors.toList());
        return new Community()
        .setNumber(Number)
        .setName(Name)
        .setGeneralAddress(GeneralAddress)
        .setHouse(houseList);
    }
}
