package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Cat;

@Configuration
public class AppConfig {


    @Bean
    public Cat getCat() {
        return new Cat();
    }

}
