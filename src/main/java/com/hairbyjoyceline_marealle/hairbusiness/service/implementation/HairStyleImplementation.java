package com.hairbyjoyceline_marealle.hairbusiness.service.implementation;

import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.entity.HairStyle;
import com.hairbyjoyceline_marealle.hairbusiness.exception.HairStyleNotFoundException;
import com.hairbyjoyceline_marealle.hairbusiness.mapper.HairStyleMapper;
import com.hairbyjoyceline_marealle.hairbusiness.repository.HairStyleRepository;
import com.hairbyjoyceline_marealle.hairbusiness.service.HairStyleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HairStyleImplementation implements HairStyleService {
    private final HairStyleRepository hairStyleRepository;

    public HairStyleImplementation(HairStyleRepository hairStyleRepository){
        this.hairStyleRepository = hairStyleRepository;
    }

    @Override
    public HairServiceDTO createHairService(HairServiceRequestDTO hairServiceRequestDTO) {
        //Using mapper to entity
       HairStyle hairStyle = HairStyleMapper.toEntity(hairServiceRequestDTO);
//chan
        //save to database
       HairStyle savedHairService =  hairStyleRepository.save(hairStyle);

       //return DTO using mapper
   return HairStyleMapper.toDTO(savedHairService);
    }

    @Override
    public List<HairServiceDTO> retrieveAllHairServices() {
        return HairStyleMapper.toDTO(hairStyleRepository.findAll());
    }

    @Override
    public HairServiceDTO findHairServiceById(Long hairService_id) throws HairStyleNotFoundException {
      HairStyle hairStyle =   hairStyleRepository.findById(hairService_id).orElseThrow(()-> new HairStyleNotFoundException(hairService_id));
        return HairStyleMapper.toDTO(hairStyle) ;
    }

    @Override
    public HairServiceDTO deleteHairService(Long hairService_id) throws HairStyleNotFoundException {
        return null;
    }
}
