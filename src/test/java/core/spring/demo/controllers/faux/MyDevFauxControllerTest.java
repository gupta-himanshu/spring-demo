package core.spring.demo.controllers.faux;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyDevFauxControllerTest {

    @Autowired
    MyFauxController myFauxController;

    @Test
    void getDataSource() {
        System.out.println(myFauxController.getDataSource());
    }
}