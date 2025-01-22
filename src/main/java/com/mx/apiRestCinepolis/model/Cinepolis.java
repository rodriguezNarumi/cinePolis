package com.mx.apiRestCinepolis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*

CREATE TABLE PELICULAS(
ID NUMBER PRIMARY KEY,
NOMBRE VARCHAR2(100)NOT NULL,
GENERO NVARCHAR2(100),
PRECIO NUMBER NOT NULL
);

 */

@Entity
@Table(name="PELICULAS")
@Data//gets y setters toString
public class Cinepolis {
	
	@Id
	@Column(name="ID", columnDefinition = "number", nullable = false)
	private Integer idCine;
	
	
	@Column(name="NOMBRE",columnDefinition ="NVARCHAR2(100)", nullable = false)
	private String nombre;
	
	
	@Column(name="GENERO",columnDefinition ="NVARCHAR2(100)", nullable = true)
	private String genero;
	
	
	@Column(name="PRECIO",columnDefinition ="NUMBER", nullable = false)
	private Integer precio;

}
