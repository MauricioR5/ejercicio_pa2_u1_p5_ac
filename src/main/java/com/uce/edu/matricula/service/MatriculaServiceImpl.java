package com.uce.edu.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.matricula.repository.IMatriculaRepository;
import com.uce.edu.matricula.repository.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Override
	public void agregar(Matricula matricula) {
		
	}

}
