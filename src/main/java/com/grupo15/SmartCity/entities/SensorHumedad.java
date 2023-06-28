package com.grupo15.SmartCity.entities;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sensorhumedad")
@Getter @Setter @NoArgsConstructor
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class SensorHumedad extends Dispositivo {
	
	private double porcentajeHumedad;
	private LocalTime tiempoEncendido;
	private boolean lluvia;
	
	public SensorHumedad(String nombre, boolean activo, double porcentajeHumedad, LocalTime tiempoEncendido,
			boolean lluvia) {
		super(nombre, activo);
		this.porcentajeHumedad = porcentajeHumedad;
		this.tiempoEncendido = tiempoEncendido;
		this.lluvia = lluvia;
	}
}
