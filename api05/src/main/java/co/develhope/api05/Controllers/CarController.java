package co.develhope.api05.Controllers;

import co.develhope.api05.DTO.CarDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RequestMapping("/cars")
@RestController
public class CarController {

    @GetMapping
    public CarDto getNewCar() {
        return new CarDto("1892-2873-2872", "Audi", 123.5);
    }

    @PostMapping("/echo")
    public String postNewCar(@Valid @RequestBody CarDto car, HttpServletResponse response) {
        System.out.println(car);
        if (response.getStatus() == 200)
            return "Success";
        else return "Not good";
    }
}