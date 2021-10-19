package com.community.enitity.dtos;


import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


// House Object Act As A Means Of Validation Of The User Input End Point, For This Data Type.
@Data
public class HouseDto{
    private long index;
    @NotBlank(message="House Owner field is blank")
    @NotEmpty(message="House Owner field is empty")
    @NotNull(message="House Owner field is null")
    private String Owner;

    @NotNull(message="House Occupant field type is null")
    @NotBlank(message = "House Occupant field type is blank")
    @NotEmpty(message = "House Occupant field type is empty")
    private String OccupantType;

    @NotBlank(message = "House Address field is blank")
    @NotBlank(message = "House Address filed type is blank")
    @NotEmpty(message = "House Address field type is empty")
    private String Address;

//    https://stackoverflow.com/questions/28150405/validation-of-a-list-of-objects-in-spring
}
