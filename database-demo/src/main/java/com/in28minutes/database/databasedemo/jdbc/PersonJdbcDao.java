package com.in28minutes.database.databasedemo.jdbc;
import java.util.List;
import java.sql.Timestamp;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.jdbc.entity.Person;

@Repository
public class PersonJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person=new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("Location"));
			person.setBirthDate(rs.getTimestamp("birth_date"));
			
			// TODO Auto-generated method stub
			return person;
		}
		
	}

 /* 1.  public List<Person> finalAll(){
		return jdbcTemplate.query("select * from person", 
    new BeanPropertyRowMapper<Person>(Person.class));
		
   }
   
   */
   
   //2nd way to map the results of the query to the bean person, replacing the beanPropertyRowMapper by PersonRowMapper
   public List<Person> finalAll(){
		return jdbcTemplate.query("select * from person", 
   new PersonRowMapper());
		
  }
   
   
		public Person finalById(int id){
			
			return jdbcTemplate.queryForObject
					("select * from person where id= ?", new Object[]{id},
	 new BeanPropertyRowMapper<Person>(Person.class));
		
		}
			public Person finalByLocation(String location){
				
				return jdbcTemplate.queryForObject
						("select * from person where location= ?", new Object[]{location},
		 new BeanPropertyRowMapper<Person>(Person.class));
			
			}
			
  public  int DeleteById(int Id){
				return jdbcTemplate.update
						("delete from person where id=?", new Object[] {Id});
			
  }
				 public  int insert(Person person) {
						return jdbcTemplate.update(
								"insert into person(id,name,location,birth_date)"
						      + "values(?, ?, ?, ?)", 
								new Object[] {	
								person.getId(), person.getName(),
								person.getLocation(),
								new Timestamp(person.getBirthDate().getTime())});
			                  
				 }
				 
						 public  int update(Person person) {
								return jdbcTemplate.update(
										"update person" +" set name=?,location =?,birth_date=?"
												+ "where id=?",
												new Object[] {	
										person.getName(),
										person.getLocation(),
										new Timestamp(person.getBirthDate().getTime()),person.getId()});
					                    		
				
  }
	}
	

