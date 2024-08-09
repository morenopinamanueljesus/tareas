package com.prueba.tareas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * The type Tareas application.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.prueba.tareas"})
public class TareasApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(TareasApplication.class, args);
	}

}
