package com.in28minutes.database.databasedemo;
// import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;
// import com.in28minutes.database.databasedemo.jdbc.entity.Person;

 //  @SpringBootApplication
public class SpringJdbcDemoApplication  implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*	logger.info("All users ->{}",dao.finalAll());
		 logger.info("User id 10001 ->{}",dao.finalById(10001));
		logger.info("User location Hyderabad ->{}",dao.finalByLocation("Hyderabad"));
	    
		logger.info("Deleting 10002 -> No of Rows Deleted -{}",dao.DeleteById(10002));
	
		logger.info("Inserting 10004 -> {}",dao.insert(new Person(10004,"Ghalay","Berlin",new Date(1))));
		
		logger.info("Inserting 10002 -> {}",dao.insert(new Person(10002,"Nikon","Germeny",new Date(2))));
		
		logger.info("Updating 10003 -> {}",dao.update(new Person(10003,"Pieter ","Amsterdam", new Date(4))));
	
	}
	*/

}
}

