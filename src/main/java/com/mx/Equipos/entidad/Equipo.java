package com.mx.Equipos.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * create table equipos(
    id number primary key,
    nombre NVARCHAR2(50),
    puntos number,
    liga NVARCHAR2(50),
    trofeos number,
    dr_tecnico NVARCHAR2(50),
    num_jugadores number
   );
 * 
 * 
 * */
@Entity
@Table(name = "equipos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipo {
	@Id
	int id;
	String nombre;
	int puntos;
	String liga;
	int trofeos;
	@Column(name = "dr_tecnico")
	String drTecnico;
	@Column(name = "num_jugadores")
	int numJugadores;
}
