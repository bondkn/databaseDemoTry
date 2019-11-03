package com.example.databaseDemoTry.repository;

import com.example.databaseDemoTry.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class JPARepositoryEntityManager {

    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id){

        System.out.println("came in to search Id of people");
        return entityManager.find(Person.class,id);

    }

    public Person updatePerson(Person person){
        System.out.println("came in to update person details");
        return entityManager.merge(person);

    }

    public Person insertPerson(Person person){
        System.out.println("came in to insert a person");
        return entityManager.merge(person);
    }

    public void deleteById(int id){
        System.out.println("came in to delete a person with Id:" + id);
        Person personToDelete = entityManager.find(Person.class, id);
        if(personToDelete!=null) {
            entityManager.remove(personToDelete);
        }
    }

}
