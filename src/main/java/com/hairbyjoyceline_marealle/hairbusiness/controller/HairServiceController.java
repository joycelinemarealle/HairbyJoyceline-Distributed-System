package com.hairbyjoyceline_marealle.hairbusiness.controller;

import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.service.HairServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hairservice")
@CrossOrigin
public class HairServiceController {
    private final HairServiceService hairServiceService;

    public HairServiceController(HairServiceService hairServiceService) {
        this.hairServiceService = hairServiceService;
    }

    @GetMapping
    public List<HairServiceDTO> retrieveAllHairServices(){
        return hairServiceService.retrieveAllHairServices();
    }

    @GetMapping("{hairService_id}")
    public HairServiceDTO findHairServiceById(@PathVariable Long hairService_id){
        return hairServiceService.findHairServiceById(hairService_id);
    }

    @GetMapping("/{hairService_id}")
    public HairServiceDTO deleteHairService(@PathVariable Long hairService_id){
        return hairServiceService.deleteHairService(hairService_id);
    }

    @PostMapping
    public HairServiceDTO createHairService(@RequestBody HairServiceRequestDTO hairServiceRequestDTO){
        return hairServiceService.createHairService(hairServiceRequestDTO);

    }
}
