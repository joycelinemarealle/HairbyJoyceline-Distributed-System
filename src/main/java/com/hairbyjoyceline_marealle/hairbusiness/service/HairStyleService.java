package com.hairbyjoyceline_marealle.hairbusiness.service;

import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.exception.HairStyleNotFoundException;

import java.util.List;

public interface HairStyleService {
HairServiceDTO createHairService(HairServiceRequestDTO hairServiceRequestDTO);
List<HairServiceDTO> retrieveAllHairServices();
HairServiceDTO findHairServiceById (Long hairService_id) throws HairStyleNotFoundException;
HairServiceDTO deleteHairService (Long hairService_id) throws HairStyleNotFoundException;



}
