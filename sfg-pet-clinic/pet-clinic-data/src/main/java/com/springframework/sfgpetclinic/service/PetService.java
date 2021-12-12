/**
 * 
 */
package com.springframework.sfgpetclinic.service;

import java.util.Set;

import com.springframework.sfgpetclinic.model.Pet;

/**
 * @author chaitanyaarava
 *
 */
public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet ownpeter);
	
	Set<Pet> findAll();
}
