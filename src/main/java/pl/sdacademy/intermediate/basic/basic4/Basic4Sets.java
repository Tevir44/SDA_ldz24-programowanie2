package pl.sdacademy.intermediate.basic.basic4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Basic4Sets {
    public static void printSet (Set<Car> set){
        set.forEach(System.out::print);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Volkswagen", "Golf", "1VWBH7A33DC118080");
        Car car2 = new Car("Audi", "A3", "1FTSW21R08EC46917");
        Car car3 = new Car("Seat", "Leon", "1FTFW1CF6EKF51253");
        Car car4= new Car("Audi", "A3", "1FMFU17538LA84228");
        Car car5 = new Car("Seat", "Ibiza", "1FTFW1CF6EKF51253");
        Car car6 = new Car("Volkswagen", "Passat", "1VWBH7A33DC118080");

        System.out.println("\nHashSet:");
        Set<Car> carSet = new HashSet<>(Arrays.asList(car1, car2, car3, car4, car5, car6));
        printSet(carSet);

        System.out.println("\nLinkedHashSet:");
        carSet = new LinkedHashSet<>(Arrays.asList(car1, car2, car3, car4, car5, car6));
        printSet(carSet);

    }
}







