package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles({"dev","default"})
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController envController;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getDataSource() {
        String dataSource = envController.getDataSource();
        assertThat(dataSource).isEqualTo("Datasource From DEV!!");
    }
}