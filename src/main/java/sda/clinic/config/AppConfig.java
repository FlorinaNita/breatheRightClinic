package sda.clinic.config;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("sda.clinic")
@EntityScan("sda.clinic.entities")
@EnableJpaRepositories("sda.clinic.repositories")
public class AppConfig {
}
