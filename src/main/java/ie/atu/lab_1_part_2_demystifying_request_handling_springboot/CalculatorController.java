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
        else if("multiply".equals(calculation)) {
            result = a * b;
        }
        else if("divide".equals(calculation)) {
            if(b != 0) {
                result = a / b;
            }
            else {
                throw new IllegalArgumentException("Error. It's not possible to divide by 0");
            }
        }
        else {
            throw new IllegalArgumentException("Error. Enter values in lowercase" + calculation);
        }
        return "Addition: " + result + "Subtraction " + result + "Multiplication: " + result + "Division: " + result;
    }
}
