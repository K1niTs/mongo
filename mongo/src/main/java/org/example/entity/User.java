package org.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private String id;
    private String name;
    private String surname;
    private int age;
    private String status;
    private int index;
    private Adress adress;




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {return surname;}

    public void setSurname (String surname) {this.surname = surname;}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) { this.adress = adress; }



}

