package com.example.databaseDemoTry;

import com.example.databaseDemoTry.entity.Person;
import com.example.databaseDemoTry.repository.JPARepositoryEntityManager;
import com.example.databaseDemoTry.repository.JPARepositorySpringData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class JPADemoTrySpringData implements CommandLineRunner {

	@Autowired
	JPARepositorySpringData daoSpringData;

	public static void main(String[] args) {
		SpringApplication.run(JPADemoTrySpringData.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hiiiiii");

		//dao.deleteById(2);

		daoSpringData.findById(2);
		daoSpringData.save(insertPerson());
	}

	private Person insertPerson() {
		Person person = new Person();
		person.setName("automatedNawab");
		person.setEmailId("automated.mail");
		person.setBirthdate(new Date());

		return person;
	}
}
