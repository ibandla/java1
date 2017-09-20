package me.makamara.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstName;
	private String lastName;
	private Long regNo;

	public Student(){

	}

	public Student (String firstName, String lastName, Long regNo){
		this.id =id;
		this.firstName =firstName;
		this.lastName =lastName;
		this.regNo = regNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Long getRegNo() {
		return regNo;
	}

	public Long getId(){
		return id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setRegNo(Long regNo) {
		this.regNo= regNo;
	}
}