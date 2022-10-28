package com.nttdata.bootcamp.webfluxmicro;

public class Person {
	
	//Variables
	private String firstname;
	private String lastName;
	private Integer age;
	
	//Getters y Setters
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	//Constructor
	public Person(String firstname, String lastName, Integer age) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.age = age;
	}
	public Person() {
		
	}
	
	
	
}
