package com.grupo15.SmartCity.models;

import java.time.LocalDateTime;

public class Evento {
	
	private int id;
	private String descripcion;
	private Dispositivo dispositivo;
	private LocalDateTime fechaHora;
	
	public Evento() {
		super();
	}
	
	public Evento(String descripcion, Dispositivo dispositivo, LocalDateTime fechaHora) {
		super();
		this.descripcion = descripcion;
		this.dispositivo = dispositivo;
		this.fechaHora = fechaHora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}
	
	
}
