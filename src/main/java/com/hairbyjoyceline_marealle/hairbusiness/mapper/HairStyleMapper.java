package com.hairbyjoyceline_marealle.hairbusiness.mapper;

import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.HairStyle;

import java.util.List;

public class HairStyleMapper {
    //Convert request DTO to entity

    public static HairStyle toEntity(HairServiceRequestDTO hairServiceRequestDTO){
        return new HairStyle(
                hairServiceRequestDTO.name(),
                hairServiceRequestDTO.duration(),
                hairServiceRequestDTO.price());
    }

    //convert Entity to DTO
    public static HairServiceDTO toDTO(HairStyle hairStyle){
        return new HairServiceDTO(
                hairStyle.getServ_id(),
                hairStyle.getName(),
                hairStyle.getDuration(),
                hairStyle.getPrice());
    }

    //Convert List HairService entities to List of HairService DTOs
    public static List<HairServiceDTO> toDTO(List<HairStyle> hairServices){
        return hairServices.stream()
                .map(hairService -> new HairServiceDTO(
                        hairService.getServ_id(),
                        hairService.getName(),
                        hairService.getDuration(),
                        hairService.getPrice()
                        )).toList();
    }
}
