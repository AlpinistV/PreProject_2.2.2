package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printOfCars(@RequestParam(value = "count", defaultValue = "5")
                                            int count, Model model) {
        model.addAttribute("cars", carService.getOfCars(count));
        return "cars";
    }
}
