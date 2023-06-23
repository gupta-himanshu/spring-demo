package core.spring.demo.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("fauxService")
public class DevFauxService implements FauxService {

    @Override
    public String getDataSource() {
        return "Dev Data Source";
    }
}
