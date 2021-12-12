/**
 * 
 */
package com.springframework.sfgpetclinic.model;

/**
 * @author chaitanyaarava
 *
 */
public class PetType extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5704825177651988141L;
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
