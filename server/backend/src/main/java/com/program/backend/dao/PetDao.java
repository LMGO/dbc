package com.program.backend.dao;

import com.program.backend.entity.Pet;

import java.util.List;

public interface PetDao {
    List<Pet> queryPet(String petId);
}
