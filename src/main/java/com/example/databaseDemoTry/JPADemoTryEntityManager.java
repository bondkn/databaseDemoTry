package com.example.databaseDemoTry;

import com.example.databaseDemoTry.entity.Person;
import com.example.databaseDemoTry.repository.JPARepositoryEntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


//@SpringBootApplication
public class JPADemoTryEntityManager implements CommandLineRunner {

	@Autowired
	JPARepositoryEntityManager daoEntityManager;

	public static void main(String[] args) {
		SpringApplication.run(JPADemoTryEntityManager.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hiiiiii");

		//dao.deleteById(2);

		daoEntityManager.insertPerson(insertPerson());
	}

	private Person insertPerson() {
		Person person = new Person();
		person.setName("automatedNawab");
		person.setEmailId("automated.mail");
		person.setBirthdate(new Date());

		return person;
	}
}
