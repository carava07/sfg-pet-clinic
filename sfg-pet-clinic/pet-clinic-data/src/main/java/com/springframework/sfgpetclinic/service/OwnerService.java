/**
 * 
 */
package com.springframework.sfgpetclinic.service;

import java.util.Set;

import com.springframework.sfgpetclinic.model.Owner;

/**
 * @author chaitanyaarava
 *
 */
public interface OwnerService {

	Owner findByLastName(String Name);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
