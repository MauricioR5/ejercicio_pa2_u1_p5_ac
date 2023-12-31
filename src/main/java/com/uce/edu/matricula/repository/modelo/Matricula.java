package com.uce.edu.matricula.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Matricula {

	private LocalDateTime fecha;
	private BigDecimal valor;
	private Vehiculo vehiculo;
	private Propietario propietario;
	
	//set and get
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
	//toString
	@Override
	public String toString() {
		return "Matricula [fecha=" + fecha + ", valor=" + valor + ", vehiculo=" + vehiculo + ", propietario="
				+ propietario + "]";
	}
	
	
	
	
}
