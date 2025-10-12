package org.example.eko_advisor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EkoAdvisorApplication {

    public static void main(String[] args) {
        SpringApplication.run(EkoAdvisorApplication.class, args);
    }

}
