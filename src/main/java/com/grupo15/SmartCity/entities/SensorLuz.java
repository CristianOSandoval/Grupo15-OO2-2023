package com.grupo15.SmartCity.entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class SensorLuz extends Dispositivo {
	
	@SuppressWarnings("unused")
	private boolean iluminado;
	@SuppressWarnings("unused")
	private boolean aulaEnUso;
	@SuppressWarnings("unused")
	private boolean cortinasAbiertas;
	
	public SensorLuz(String nombre, boolean activo, boolean iluminado, boolean aulaEnUso, boolean cortinasAbiertas) {
		super(nombre, activo);
		this.iluminado = iluminado;
		this.aulaEnUso = aulaEnUso;
		this.cortinasAbiertas = cortinasAbiertas;
	}
	
}
