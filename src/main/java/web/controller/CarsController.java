package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/")

public class CarsController {
    @RequestMapping("/cars")

    public String printWelcome(ModelMap model, @RequestParam(value = "locale") String locale) {

        List<Car> cars = CarService.getAllCars();
        model.addAttribute("cars", cars);
        if (locale != null) {
            if (locale.equals("en")) {
                model.addAttribute("title", "CARS");
            } else if (locale.equals("ru")) {
                model.addAttribute("title", "МАШИНЫ");
            }
        }

        return "cars";
    }
}
