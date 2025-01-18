package com.example;

public class Car {
    private String brand;
    private String model;
    private int speed;

    // Default constructor
    public Car() {
        this.brand = "Audi";
        this.model = "A8A8";
        this.speed = 0;
    }

    // Constructor with parameters
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    // Getter methods for brand, model, and speed  
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
         return model;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    // Display car status
    // Note: method names start with a lowercase letter followed by uppercase, e.g., sayHello
    public void carInfo() {
        System.out.println("Auto: " + getBrand() + " " + getModel() + ", Nopeus: " + getSpeed() + " km/h");
    }

    // Change the car's brand and model
    public void changeBrandAndModel(String newBrand, String newModel) { // Strings in parentheses ( ) are the information provided by the user, which is processed by the method
        this.brand = newBrand;
        this.model = newModel;
    }

    // Accelerate the car
    // The value of the variable increment is passed into the increaseSpeed method and assigned to the parameter increment.
    public void increaseSpeed(int increment) {
        if (increment > 0) {
            speed += increment;
        } else {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        }
    }

    // Decelerate the car
    public void decreaseSpeed(int decrement) {
        if (decrement > 0) {
            if (speed - decrement >= 0) {
                speed -= decrement;
            } else {
                speed = 0;
            }
        } else {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        }
    }
}
