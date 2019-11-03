package com.example.databaseDemoTry;

import com.example.databaseDemoTry.repository.JPARepositoryEntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

//@SpringBootApplication
public class DatabaseDemoTryApplication  {

	@Autowired
	JPARepositoryEntityManager dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoTryApplication.class, args);

	}

	//@Override
	public void run(){
		System.out.println("hiiii");


	}

}
