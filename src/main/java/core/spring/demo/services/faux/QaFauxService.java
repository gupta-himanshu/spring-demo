package core.spring.demo.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("fauxService")
public class QaFauxService implements FauxService {

    @Override
    public String getDataSource() {
        return "QA Data Source";
    }
}
