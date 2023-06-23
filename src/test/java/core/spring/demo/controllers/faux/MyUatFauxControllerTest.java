package core.spring.demo.controllers.faux;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"uat", "EN"})
@SpringBootTest
class MyUatFauxControllerTest {

    @Autowired
    MyFauxController myFauxController;

    @Test
    void getDataSource() {
        System.out.println(myFauxController.getDataSource());
    }
}