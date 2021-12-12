/**
 * 
 */
package com.springframework.sfgpetclinic.service;

import java.util.Set;

import com.springframework.sfgpetclinic.model.Vet;

/**
 * @author chaitanyaarava
 *
 */
public interface VetService {

	Vet findById(Long id);

	Vet save(Vet owner);

	Set<Vet> findAll();
}
