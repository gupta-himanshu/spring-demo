package core.spring.demo.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("fauxService")
public class UatFauxService implements FauxService {

    @Override
    public String getDataSource() {
        return "UAT Data Source";
    }
}
