package com.program.backend.service;

import com.program.backend.entity.Pet;

import java.util.List;

public interface PetService {
    List<Pet> queryPet(String petId);
}
