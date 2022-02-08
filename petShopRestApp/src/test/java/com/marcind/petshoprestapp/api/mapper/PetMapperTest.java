package com.marcind.petshoprestapp.api.mapper;

import org.junit.jupiter.api.Test;

import com.marcind.petshoprestapp.api.model.PetDTO;
import com.marcind.petshoprestapp.domain.Pet;
import static org.junit.Assert.*;

class PetMapperTest {
	
	PetMapper petMapper = PetMapper.INSTANCE;
	
	@Test
	void petToPetDTO() {
		// given
		Pet pet = new Pet();
		pet.setId(1L);
		pet.setName("Pet");
		pet.setStatus("available");
		
		// when
		PetDTO petDTO = petMapper.petToPetDTO(pet);
		
		// then
		assertEquals(Long.valueOf(1L), petDTO.getId());
		assertEquals("Pet", petDTO.getName());
		assertEquals("available", petDTO.getStatus());
		
	}
}
