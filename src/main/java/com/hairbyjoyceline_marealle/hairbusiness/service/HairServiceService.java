package com.hairbyjoyceline_marealle.hairbusiness.service;

import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.exception.HairServiceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HairServiceService extends JpaRepository <HairServiceService,Long> {
HairServiceDTO createHairService(HairServiceRequestDTO hairServiceRequestDTO);
List<HairServiceDTO> retrieveAllHairServices();
HairServiceDTO findHairServiceById (Long hairService_id) throws HairServiceNotFoundException;
HairServiceDTO deleteHairService (Long hairService_id) throws HairServiceNotFoundException;



}
