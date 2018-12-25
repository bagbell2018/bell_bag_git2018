package com.company;

public class Lorry extends Car{
    String loadCapacity;
    Lorry(){
        super();
        loadCapacity = "600";
    }
    // Переназначение марки автомобиля и изменение грузоподъемности
    Lorry(String company, String weight, String horsePower, String loadCapacity){
        super(company, weight, horsePower);
        this.loadCapacity = loadCapacity;
    }
    void setLoadCapacity(String loadCapacity){this.loadCapacity = loadCapacity;}
    void setCompany(String company){this.company = company;}
    void setCompAndCapacity(String company, String loadCapacity){
        this.loadCapacity = loadCapacity;
        this.company = company;
    }
}