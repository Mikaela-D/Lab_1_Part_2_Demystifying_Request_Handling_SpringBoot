package ie.atu.lab_1_part_2_demystifying_request_handling_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}