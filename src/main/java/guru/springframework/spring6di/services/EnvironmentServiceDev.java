package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
public class EnvironmentServiceDev implements EnvironmentService{
    @Override
    public String getDataSource() {
        return "Datasource From DEV!!";
    }
}
