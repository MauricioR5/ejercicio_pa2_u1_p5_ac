package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.matricula.repository.modelo.Propietario;
import com.uce.edu.matricula.repository.modelo.Vehiculo;
import com.uce.edu.matricula.service.IPropietarioService;
import com.uce.edu.matricula.service.IVehiculoService;

@SpringBootApplication
public class EjercicioPaU1P5AcApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService iVehiculoService;

	@Autowired
	private IPropietarioService iPropietarioService;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P5AcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//Literal 1

		Vehiculo v1 = new Vehiculo();
		v1.setMarca("Hyundai");
		v1.setPlaca("PCY-0505");
		v1.setPrecio(new BigDecimal(15000));
		v1.setTipo("Liviano");

		this.iVehiculoService.agregar(v1);
		System.out.println("Se agregó el vehículo: " + v1);
	

//Literal 2

		Propietario p1 = new Propietario();
		p1.setNombre("Augusto");
		p1.setApellido("Arteaga");
		p1.setCedula("17171717");
		p1.setGenero("Masculino");
		
		this.iPropietarioService.agregar(p1);
		System.out.println("Se agregó el propietario: " + p1);
		
//Literal 3
		
		p1.setApellido("Cacuango");
		p1.setCedula("123456789");
		this.iPropietarioService.actualizar(p1);
		System.out.println("Se actualizaron los datos: "+ p1);
	}
	
	
	
}
