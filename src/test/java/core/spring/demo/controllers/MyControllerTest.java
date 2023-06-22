package core.spring.demo.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void sayHello() {
        MyController controller = new MyController();

        System.out.println(controller.sayHello());
    }

}