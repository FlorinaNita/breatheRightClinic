package sda.clinic;

import org.springframework.boot.SpringApplication;
import sda.clinic.config.AppConfig;

public class App 
{
    public static void main( String[] args ) {

        SpringApplication.run(AppConfig.class);
    }
}
