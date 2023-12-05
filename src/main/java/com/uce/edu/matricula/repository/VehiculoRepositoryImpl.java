package com.uce.edu.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matricula.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	private static List<Vehiculo> base = new ArrayList<>();
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		 base.add(vehiculo);
	}

}
