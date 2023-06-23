package com.grupo15.SmartCity.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dispositivo")
@Getter @Setter @NoArgsConstructor
public class Dispositivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "activo")
	private boolean activo;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="dispositivo")
	private Set<Evento> degrees = new HashSet<>();
	
	@Column(name="createdate")
	@CreationTimestamp
	private LocalDateTime createdAt;

	@Column(name="updatedate")
	@UpdateTimestamp
	private LocalDateTime updatedAt;

	public Dispositivo(String nombre, boolean activo) {
		super();
		this.nombre = nombre;
		this.activo = activo;
	}

}
