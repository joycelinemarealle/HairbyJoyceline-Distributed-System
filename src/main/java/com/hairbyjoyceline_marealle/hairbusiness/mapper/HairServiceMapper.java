package com.hairbyjoyceline_marealle.hairbusiness.mapper;

import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.HairService;

import java.util.List;

public class HairServiceMapper {
    //Convert request DTO to entity

    public static HairService toEntity(HairServiceRequestDTO hairServiceRequestDTO){
        return new HairService(
                hairServiceRequestDTO.name(),
                hairServiceRequestDTO.duration(),
                hairServiceRequestDTO.price());
    }

    //convert Entity to DTO
    public static HairServiceDTO toDTO(HairService hairService){
        return new HairServiceDTO(
                hairService.getServ_id(),
                hairService.getName(),
                hairService.getDuration(),
                hairService.getPrice());
    }

    //Convert List HairService entities to List of HairService DTOs
    public static List<HairServiceDTO> toDTO(List<HairService> hairServices){
        return hairServices.stream()
                .map(hairService -> new HairServiceDTO(
                        hairService.getServ_id(),
                        hairService.getName(),
                        hairService.getDuration(),
                        hairService.getPrice()
                        )).toList();
    }
}
