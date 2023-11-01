package org.example.entity;

import org.springframework.data.annotation.Id;

public class Numbers {

    public int getNumbers_street() {
        return numbers_street;
    }

    public void setNumbers_street(int numbers_street) {
        this.numbers_street = numbers_street;
    }

    public int getNumbers_order() {
        return numbers_order;
    }

    public void setNumbers_order(int numbers_order) {
        this.numbers_order = numbers_order;
    }

    private int numbers_street;
    private int numbers_order;


    }

