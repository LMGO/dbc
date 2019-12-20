package com.program.backend.dao;

import com.program.backend.entity.Pet;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class PetDaoTest {
    @Autowired
    private PetDao petDao;

    @Test
    void queeryPet() {
        List<Pet> query = petDao.queryPet("Akita");
        assertEquals(1, query.size());
    }

    @Test
    void queeryPet2() {
        List<Pet> query = petDao.queryPet("Alaskan_malamute");
        assertEquals("阿拉斯加雪橇犬（阿拉斯加犬、阿拉斯加马拉缪特、阿拉斯加马拉穆）", query.get(0).getPetName());
    }
}