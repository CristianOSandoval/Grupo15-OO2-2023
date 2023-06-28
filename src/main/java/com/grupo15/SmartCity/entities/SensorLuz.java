package com.grupo15.SmartCity.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sensorluz")
@Getter @Setter @NoArgsConstructor
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class SensorLuz extends Dispositivo {
	
	private boolean iluminado;
	private boolean aulaEnUso;
	private boolean cortinasAbiertas;
	
	public SensorLuz(String nombre, boolean activo, boolean iluminado, boolean aulaEnUso, boolean cortinasAbiertas) {
		super(nombre, activo);
		this.iluminado = iluminado;
		this.aulaEnUso = aulaEnUso;
		this.cortinasAbiertas = cortinasAbiertas;
	}
	
}
