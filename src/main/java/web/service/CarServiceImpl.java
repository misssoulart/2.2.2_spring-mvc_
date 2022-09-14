package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "One", "10"));
        cars.add(new Car(2, "Two", "20"));
        cars.add(new Car(3, "Three", "30"));
        cars.add(new Car(4, "Four", "40"));
        cars.add(new Car(5, "Five", "50"));
    }

    @Override
    public List<Car> getSomeCars (int count) {
        List<Car> carList = new ArrayList<>();
        if (count >= 5) {
            count = 5;
        }
        for (int i = 0; i < count; i++) {
            carList.add(cars.get(i));
        }
        return carList;
    }
}


