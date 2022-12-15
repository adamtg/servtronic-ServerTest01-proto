package com.devitron.servtronic.servicetest01.config;

import com.devitron.servtronic.servicebase.config.ConfigBase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class Config {

    @Bean
    public ServiceTest01Config getConfig() throws IOException {
        System.out.println("=========================================");
        System.out.println("ServiceTest01Config loadConfig in class");
        System.out.println("=========================================");

        ServiceTest01Config config = (ServiceTest01Config) ServiceTest01Config.load("ServerTest01Config.json",
                ServiceTest01Config.class);

        return config;
    }
}
