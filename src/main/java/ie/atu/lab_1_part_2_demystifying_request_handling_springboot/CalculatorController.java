package ie.atu.lab_1_part_2_demystifying_request_handling_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public String calculate(@RequestParam int a, @RequestParam  int b, @RequestParam String calculation) {
        float result = 0;
        if("add".equals(calculation)) {
            result = a + b;
        }
        else if("subtract".equals(calculation)) {
            result = a - b;
        }
        return "Addition: " + result + "Subtraction " + result;
    }
}
