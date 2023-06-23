package core.spring.demo.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("fauxService")
public class ProdFauxService implements FauxService {

    @Override
    public String getDataSource() {
        return "Production Data Source";
    }
}
