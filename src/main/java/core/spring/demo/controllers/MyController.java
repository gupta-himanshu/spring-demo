package core.spring.demo.controllers;

import core.spring.demo.services.GreetingService;
import core.spring.demo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I am in the controller");

        return greetingService.sayGreeting();
    }
}
