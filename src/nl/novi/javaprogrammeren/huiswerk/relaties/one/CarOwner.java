package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class CarOwner {

    private String name;
    private int age;

    private List<Car> ownedCars = new ArrayList<>();

    public CarOwner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addCar(Car car) {
        for (Car ownedCar : ownedCars) {
            if (ownedCar.getKenteken().equals(car.getKenteken())) {
                System.out.println("De eigenaar heeft al een auto met dit kenteken!");
                return;
            }
        }
        ownedCars.add(car);



    }

    public List<Car> getOwnedCars() {
        return ownedCars;
    }

    public int getAge() {
        return this.age;
    }
}
