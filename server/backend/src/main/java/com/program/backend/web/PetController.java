package com.program.backend.web;

import com.program.backend.entity.Pet;
import com.program.backend.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/pet")
public class PetController {
    @Autowired
    private PetService petService;

    @RequestMapping(value="/querypet", method = RequestMethod.GET)
    private Map<String, Object> queryPet(String petId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Pet> petList = petService.queryPet(petId);
        modelMap.put("information", petList);
        return modelMap;
    }
}
