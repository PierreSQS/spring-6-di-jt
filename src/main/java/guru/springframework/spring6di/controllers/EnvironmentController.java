package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    private final EnvironmentService envServ;

    public EnvironmentController(EnvironmentService envServ) {
        this.envServ = envServ;
    }

    public String getDataSource() {
        return envServ.getDataSource();
    }
}
