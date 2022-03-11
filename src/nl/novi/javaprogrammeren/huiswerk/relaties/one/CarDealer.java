package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {

    List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        for (Car currentCar: cars) {

            if (currentCar.getKenteken().equals(car.getKenteken())) {
                System.out.println("De garage heeft al een auto met z'n kenteken!");
                return;
            }
        }

        this.cars.add(car);

    }

    public void soldCar(Car car, CarOwner owner) {
        if (owner.getAge() < 18) {
            System.out.println("Je bent te jong om een auto te kopen!");
            return;
        }

        if (!cars.contains(car)) {
            System.out.println("De garage heeft deze auto niet meer!");
            return;
        }

        for (Car currentCar: owner.getOwnedCars()) {
            if (currentCar.getKenteken().equals(car.getKenteken())) {
                System.out.println("De eigenaar heeft al een auto met z'n kenteken!");
                return;
            }
        }

        car.setOwner(owner);
        owner.addCar(car);
        this.cars.remove(car);




    }

}
