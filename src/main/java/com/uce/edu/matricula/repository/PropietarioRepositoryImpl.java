package com.uce.edu.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matricula.repository.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	private static List<Propietario> base = new ArrayList<>();

	@Override
	public void insertar(Propietario propietario) {
		base.add(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {

		this.eliminar(propietario.getCedula());
		this.insertar(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		Propietario p = this.seleccionar(cedula);
		base.remove(p);
	}

	@Override
	public Propietario seleccionar(String cedula) {
		for (Propietario propietario : base) {
			if (propietario.getCedula().equals(cedula)) {

				Propietario p = new Propietario();

				p.setNombre(propietario.getNombre());
				p.setApellido(propietario.getApellido());
				p.setCedula(propietario.getCedula());
				p.setGenero(propietario.getGenero());
				return propietario;
			}
		}
		return null;
	}

}
