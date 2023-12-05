package com.uce.edu.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.matricula.repository.IPropietarioRepository;
import com.uce.edu.matricula.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	@Override
	public void agregar(Propietario propietario) {
		this.iPropietarioRepository.insertar(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.iPropietarioRepository.actualizar(propietario);
	}

}
