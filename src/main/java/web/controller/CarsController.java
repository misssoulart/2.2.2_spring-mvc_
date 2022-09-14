package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    // Spring Framework. Урок 19: Параметры GET запроса. (Алишев)
    // Spring Framework. Урок 20: Модель. Передача данных от контроллера к представлению. (Алишев)
    @GetMapping()
    public String getSomeCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        System.out.println(count);
        List<Car> carList = new ArrayList<>();
        carList = carService.getSomeCars(count);
        carList.stream().forEach(System.out::println);
        model.addAttribute("cars", carService.getSomeCars(count));
        return "cars";
    }
}