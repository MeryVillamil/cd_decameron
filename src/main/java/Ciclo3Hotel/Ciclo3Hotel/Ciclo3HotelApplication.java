//Categoria,mensaje ,Reservacion,cliente
//1. Moelo o entidad
//2. Interfaces 
//3.repositorio
//servicios
//controlador o web


package Ciclo3Hotel.Ciclo3Hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages ={"Ciclo3Hotel.Ciclo3Hotel.Modelo"})

public class Ciclo3HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3HotelApplication.class, args);
	}

}
