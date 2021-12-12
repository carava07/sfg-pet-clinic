/**
 * 
 */
package com.springframework.sfgpetclinic.model;

/**
 * @author chaitanyaarava
 *
 */
public class Person extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2609819976981306460L;
	
	private String firstName;
	private String lastName;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
