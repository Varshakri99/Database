package com.in28minutes.database.databasedemo.jpa;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.database.databasedemo.jdbc.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
//Repository
//Transaction Mangement
@Repository
@Transactional
public class PersonJpaRepository {

	//How to connect with database
	
	@PersistenceContext 
	EntityManager entitymanager; //entitymanager is the interface to the persistence context
	//Way to retrieve all data
	
	public Person finalById(int id)
	{
		return entitymanager.find(Person.class,id); //JPA name of the entity, primary key
	}
	
	public Person update(Person person)
	{
		return entitymanager.merge(person); //JPA name of the entity, primary key
	}
	
	public Person insert(Person person)
	{
		return entitymanager.merge(person); //JPA name of the entity, primary key
	}
	
	public void deleteById(int id)
	{
		Person person=finalById(id);
		entitymanager.remove(person);
		
	}
	
	public List<Person> findAll(){
		TypedQuery<Person> namedQuery=
				entitymanager.createNamedQuery("find_all_person",Person.class);
		
		return namedQuery.getResultList();
		
	}
	
	
	
}
