package com.grupo15.SmartCity.models;

import java.time.LocalTime;

public class SensorHumedad extends Dispositivo {
	
	private double porcentajeHumedad;
	private LocalTime tiempoEncendido;
	private boolean lluvia;
	
	public SensorHumedad() {
		super();
	}

	public SensorHumedad(double porcentajeHumedad, LocalTime tiempoEncendido, boolean lluvia) {
		super();
		this.porcentajeHumedad = porcentajeHumedad;
		this.tiempoEncendido = tiempoEncendido;
		this.lluvia = lluvia;
	}

	public double getPorcentajeHumedad() {
		return porcentajeHumedad;
	}

	public void setPorcentajeHumedad(double porcentajeHumedad) {
		this.porcentajeHumedad = porcentajeHumedad;
	}

	public LocalTime getTiempoEncendido() {
		return tiempoEncendido;
	}

	public void setTiempoEncendido(LocalTime tiempoEncendido) {
		this.tiempoEncendido = tiempoEncendido;
	}

	public boolean isLluvia() {
		return lluvia;
	}

	public void setLluvia(boolean lluvia) {
		this.lluvia = lluvia;
	}
	
	
}
