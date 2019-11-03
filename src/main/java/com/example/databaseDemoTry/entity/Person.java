package com.example.databaseDemoTry.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private int Id;

    private String name;
    private String emailid;
    private Date birthdate;


    public Person() {

    }

    public Person(int id, String name, String emailId, Date birthdate) {
        Id = id;
        this.name = name;
        this.emailid = emailId;
        this.birthdate = birthdate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailid;
    }

    public void setEmailId(String emailId) {
        this.emailid = emailId;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", emailid='" + emailid + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
