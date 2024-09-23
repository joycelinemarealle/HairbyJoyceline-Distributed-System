package com.hairbyjoyceline_marealle.hairbusiness.service.implementation;

import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.HairService;
import com.hairbyjoyceline_marealle.hairbusiness.exception.HairServiceNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.repository.HairServiceRepo;
import com.hairbyjoyceline_marealle.hairbusiness.service.HairServiceService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HairServiceImplementation implements HairServiceService {
    private final HairServiceRepo hairServiceRepo;

    public HairServiceImplementation(HairServiceRepo hairServiceRepo){
        this.hairServiceRepo = hairServiceRepo;
    }

    @Override
    public HairServiceDTO createHairService(HairServiceRequestDTO hairServiceRequestDTO) {
        //Using mapper to entity

        //save to database

       //return DTO using mapper
   return null;
    }

    @Override
    public List<HairServiceDTO> retrieveAllHairServices() {
        return List.of();
    }

    @Override
    public HairServiceDTO findHairServiceById(Long hairService_id) throws HairServiceNotFoundException {
        return null;
    }

    @Override
    public HairServiceDTO deleteHairService(Long hairService_id) throws HairServiceNotFoundException {
        return null;
    }
}
