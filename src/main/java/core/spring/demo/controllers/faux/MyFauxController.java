package core.spring.demo.controllers.faux;

import core.spring.demo.services.faux.FauxService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyFauxController {

    private final FauxService fauxService;

    public MyFauxController(@Qualifier("fauxService") FauxService fauxService) {
        this.fauxService = fauxService;
    }

    public String getDataSource() {
        return fauxService.getDataSource();
    }
}
