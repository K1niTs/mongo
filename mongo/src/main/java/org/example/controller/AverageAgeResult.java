package org.example.controller;

import org.springframework.data.annotation.Id;

public class AverageAgeResult {
    private double averageAge;

    public double getAverageAge() {
        return averageAge;
    }

    public void setAverageAge(double averageAge) {
        this.averageAge = averageAge;
    }
}
