package it.desotech.tapdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        return "Hello " + name + "!\n";
    }
}
