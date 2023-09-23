package com.mx.Equipos.service;

import com.mx.Equipos.entidad.Equipo;
import com.mx.Equipos.respuesta.Respuesta;

public interface Metodos {
	public Respuesta lista();
	public Respuesta guardar(Equipo equipo);
	public Respuesta actualizar(Equipo equipo);
	public Respuesta eliminar(Equipo equipo);
}
