package com.hairbyjoyceline_marealle.hairbusiness.service.implementation;

import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.HairService;
import com.hairbyjoyceline_marealle.hairbusiness.exception.HairServiceNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.mapper.HairServiceMapper;
import com.hairbyjoyceline_marealle.hairbusiness.repository.HairServiceRepository;
import com.hairbyjoyceline_marealle.hairbusiness.service.HairServiceService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HairServiceImplementation implements HairServiceService {
    private final HairServiceRepository hairServiceRepository;

    public HairServiceImplementation(HairServiceRepository hairServiceRepository){
        this.hairServiceRepository = hairServiceRepository;
    }

    @Override
    public HairServiceDTO createHairService(HairServiceRequestDTO hairServiceRequestDTO) {
        //Using mapper to entity
       HairService hairService = HairServiceMapper.toEntity(hairServiceRequestDTO);
//chan
        //save to database
       HairService savedHairService =  hairServiceRepository.save(hairService);

       //return DTO using mapper
   return HairServiceMapper.toDTO(savedHairService);
    }

    @Override
    public List<HairServiceDTO> retrieveAllHairServices() {
        return HairServiceMapper.toDTO(hairServiceRepository.findAll());
    }

    @Override
    public HairServiceDTO findHairServiceById(Long hairService_id) throws HairServiceNotFoundException {
      HairService hairService =   hairServiceRepository.findById(hairService_id).orElseThrow(()-> new HairServiceNotFoundException(hairService_id));
        return HairServiceMapper.toDTO(hairService) ;
    }

    @Override
    public HairServiceDTO deleteHairService(Long hairService_id) throws HairServiceNotFoundException {
        return null;
    }
}
