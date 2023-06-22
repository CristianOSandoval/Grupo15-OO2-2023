package com.grupo15.SmartCity.models;

public abstract class Dispositivo {
	
	protected int id;
	protected String nombre;
	protected boolean activo;

	public Dispositivo() {
		super();
	}

	public Dispositivo(String nombre, boolean activo) {
		super();
		this.nombre = nombre;
		this.activo = activo;
	}
	
}
