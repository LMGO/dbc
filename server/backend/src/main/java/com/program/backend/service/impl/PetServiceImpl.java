package com.program.backend.service.impl;

import com.program.backend.dao.PetDao;
import com.program.backend.entity.Pet;
import com.program.backend.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {
    @Autowired
    private PetDao petDao;

    @Override
    public List<Pet> queryPet(String petId) {
        return petDao.queryPet(petId);
    }
}
