package com.devitron.servtronic.servicetest01;

import com.devitron.servtronic.servicebase.data.SetupFunctionToMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication(scanBasePackages={"com.devitron.servtronic.servicebase", "com.devitron.servtronic.servicetest01"})
public class ServtronicServerTest01ProtoApplication {

	public static void main(String[] args) {

		try {
			SetupFunctionToMethod.pullInAnnotations();
		} catch (IOException | NoSuchFieldException e) {
			e.printStackTrace();
			return;
		}

		SpringApplication.run(ServtronicServerTest01ProtoApplication.class, args);
	}

}
