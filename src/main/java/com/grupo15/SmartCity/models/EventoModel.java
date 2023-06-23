package com.grupo15.SmartCity.models;

import java.time.LocalDateTime;

import com.grupo15.SmartCity.entities.Dispositivo;

public class EventoModel {
	
	private String descripcion;
	private Dispositivo dispositivo;
	private LocalDateTime fechaHora;

	public EventoModel(String descripcion, Dispositivo dispositivo, LocalDateTime fechaHora) {
		super();
		this.descripcion = descripcion;
		this.dispositivo = dispositivo;
		this.fechaHora = fechaHora;
	}

	public EventoModel() {
		super();
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
