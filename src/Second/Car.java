package Second;

import java.util.Arrays;

public class Car {
    private String brand;

    public static int countCars = 0;

    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }


    public static void printBrands() {
        System.out.println("Перечень доступных брендов: audi, kia, bmw");
    }
}