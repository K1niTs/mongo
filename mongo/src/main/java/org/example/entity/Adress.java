package org.example.entity;

import org.springframework.data.annotation.Id;

public class Adress {

    private String city;
    private String street;

    public Numbers getNumbers() {
        return numbers;
    }

    public void setNumbers(Numbers numbers) {
        this.numbers = numbers;
    }

    private Numbers numbers;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
