package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car newCar = null; // Create newCar to get the car information that the user provides
        boolean exit = false;

        while (!exit) { // The loop will run until it encounters 'true'
            if (newCar == null) {
                System.out.print("Anna auton merkki: ");
                String brand = sc.nextLine();
                System.out.print("Anna auton malli: ");
                String model = sc.nextLine();
                // Car is the class name, calling the constructor of the Car class
                newCar = new Car(brand, model); 
                // Directly pass the user-provided values for brand and model because the car value is initially null (empty)
            }

            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokkaa auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");

            if (sc.hasNextInt()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:
                        // Display the car status by calling the carInfo method from Car.java
                        newCar.carInfo();
                        break;
                    case 2:
                        System.out.print("Anna uusi auton merkki: ");
                        String newBrand = sc.nextLine();
                        System.out.print("Anna uusi auton malli: ");
                        String newModel = sc.nextLine();
                        newCar.changeBrandAndModel(newBrand, newModel);
                        break;
                    case 3:
                        // Accelerate the car
                        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                        int speedUp = Integer.parseInt(sc.nextLine());
                        newCar.increaseSpeed(speedUp);
                        break;
                    case 4:
                        // Giảm tốc xe
                        System.out.print("Kuinka monta km/h haluat hidastaa? ");
                        int speedDown = Integer.parseInt(sc.nextLine());
                        newCar.decreaseSpeed(speedDown);
                        break;
                    case 0:
                        // Kết thúc chương trình
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
    }
}
