package com.in28minutes.database.databasedemo.jdbc.entity;
import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;


@Entity
@NamedQuery(name="find_all_person",query="select p from Person p")
public class Person {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String location;
	@Column(name="BIRTH_DATE")
	private Date birthdate;
	
    
	public Person() {
	
	}


	 public Person(int id, String name, String location, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthdate = birthdate;
	}
	 
	 public Person( String name, String location, Date birthdate) {
		super();
		this.name = name;
		this.location = location;
		this.birthdate = birthdate;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Date getBirthDate() {
		return birthdate;
	}


	public void setBirthDate(Date timestamp) {
		this.birthdate = timestamp;
	}


	@Override
	public String toString() {
		return String.format( "\n Person [id=" + id + ", name=" + name + ", location=" + location + ", birthdate=" + birthdate + "]");
	}


	public void setBirthDate(Timestamp timestamp) {
		// TODO Auto-generated method stub
		
	}


	public void setBirthDate1(Timestamp timestamp) {
		// TODO Auto-generated method stub
		
	}

	
	

}
