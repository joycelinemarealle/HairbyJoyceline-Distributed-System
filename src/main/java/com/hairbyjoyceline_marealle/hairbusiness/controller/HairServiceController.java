package com.hairbyjoyceline_marealle.hairbusiness.controller;

import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceDTO;
import com.hairbyjoyceline_marealle.hairbusiness.dto.HairServiceRequestDTO;
import com.hairbyjoyceline_marealle.hairbusiness.service.HairStyleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hairservice")
@CrossOrigin
public class HairServiceController {
    private final HairStyleService hairStyleService;

    public HairServiceController(HairStyleService hairStyleService) {
        this.hairStyleService = hairStyleService;
    }

    @GetMapping
    public List<HairServiceDTO> retrieveAllHairServices(){
        return hairStyleService.retrieveAllHairServices();
    }

    @GetMapping("{hairService_id}")
    public HairServiceDTO findHairServiceById(@PathVariable Long hairService_id){
        return hairStyleService.findHairServiceById(hairService_id);
    }

    @GetMapping("/{hairService_id}")
    public HairServiceDTO deleteHairService(@PathVariable Long hairService_id){
        return hairStyleService.deleteHairService(hairService_id);
    }

    @PostMapping
    public HairServiceDTO createHairService(@RequestBody HairServiceRequestDTO hairServiceRequestDTO){
        return hairStyleService.createHairService(hairServiceRequestDTO);

    }
}
