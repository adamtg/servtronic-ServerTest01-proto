package com.devitron.servtronic.servicetest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com.devitron.servtronic.servicebase"})
public class ServtronicServerTest01ProtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServtronicServerTest01ProtoApplication.class, args);
	}

}
