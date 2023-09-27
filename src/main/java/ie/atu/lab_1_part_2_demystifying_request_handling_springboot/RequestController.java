package ie.atu.lab_1_part_2_demystifying_request_handling_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/greet/{mikaela}")
    public String greetByName(@PathVariable String mikaela) {
        return "Greetings " + mikaela;
    }

    @GetMapping("/details/")
    public String details(@RequestParam String name, int age) {
        return "Name: " + name + "Age: " + age;
    }
}

