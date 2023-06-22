package com.grupo15.SmartCity.models;

public class SensorLuz extends Dispositivo {
	
	private boolean iluminado;
	private boolean aulaEnUso;
	private boolean cortinasAbiertas;
	
	public SensorLuz() {
		super();
	}
	
	public SensorLuz(boolean iluminado, boolean aulaEnUso, boolean cortinasAbiertas) {
		super();
		this.iluminado = iluminado;
		this.aulaEnUso = aulaEnUso;
		this.cortinasAbiertas = cortinasAbiertas;
	}

	public boolean isIluminado() {
		return iluminado;
	}

	public void setIluminado(boolean iluminado) {
		this.iluminado = iluminado;
	}

	public boolean isAulaEnUso() {
		return aulaEnUso;
	}

	public void setAulaEnUso(boolean aulaEnUso) {
		this.aulaEnUso = aulaEnUso;
	}

	public boolean isCortinasAbiertas() {
		return cortinasAbiertas;
	}

	public void setCortinasAbiertas(boolean cortinasAbiertas) {
		this.cortinasAbiertas = cortinasAbiertas;
	}
	
	
}
