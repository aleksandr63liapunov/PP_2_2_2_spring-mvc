package web.controller;

import modelcar.Car;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarController {
    @GetMapping("/cars")
    public String showCar(Model model){
        List<Car> list = new ArrayList<>();
        list.add(new Car("qq","qqw",1));
        list.add(new Car("qqq","qqs",2));
        list.add(new Car("qqqq","qqx",3));
        list.add(new Car("qqqqq","qqe",4));
        list.add(new Car("qqqqqq","qqd",5));
        model.addAttribute("list",list);
        return "list";
    }
}
