package com.portafolio.Sistema_Mesa_Ayuda_TI;

import org.springframework.boot.SpringApplication;

public class TestSistemaMesaAyudaTiApplication {

	public static void main(String[] args) {
		SpringApplication.from(SistemaMesaAyudaTiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
