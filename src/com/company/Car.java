package com.company;

public class Car {
    String company, weight, horsePower;
    // Company = Компания, Weight = вес, HorsePower = кол-во лошадиных сил
    Car(){
        company = "Ford";
        weight = "1373";
        horsePower = "125";
    }
    Car(String company,String weight, String horsePower){
        this.company = company;
        this.weight = weight;
        this.horsePower = horsePower;
    }
    void setHorsePower(String newHorsePower){ horsePower = newHorsePower;}
}