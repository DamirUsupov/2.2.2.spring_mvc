package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {


    public static List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "M3", "1990"));
        cars.add(new Car("MB", "500E", "1989"));
        cars.add(new Car("Chrysler", "300C", "2005"));
        return cars;
    }

}
