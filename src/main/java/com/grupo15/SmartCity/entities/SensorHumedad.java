package com.grupo15.SmartCity.entities;

import java.time.LocalTime;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class SensorHumedad extends Dispositivo {
	
	@SuppressWarnings("unused")
	private double porcentajeHumedad;
	@SuppressWarnings("unused")
	private LocalTime tiempoEncendido;
	@SuppressWarnings("unused")
	private boolean lluvia;
	
	public SensorHumedad(String nombre, boolean activo, double porcentajeHumedad, LocalTime tiempoEncendido,
			boolean lluvia) {
		super(nombre, activo);
		this.porcentajeHumedad = porcentajeHumedad;
		this.tiempoEncendido = tiempoEncendido;
		this.lluvia = lluvia;
	}
}
