package com.sincronizador.drive1.SNAPSHOT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SincronizadorDriveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SincronizadorDriveApplication.class, args);
	}

}
