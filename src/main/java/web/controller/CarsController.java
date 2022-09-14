package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    // Spring Framework. Урок 19: Параметры GET запроса. (Алишев)
    // Spring Framework. Урок 20: Модель. Передача данных от контроллера к представлению. (Алишев)
    @GetMapping(value = "/cars")
    public String show(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.showCars(count));
        return "cars";
    }
}