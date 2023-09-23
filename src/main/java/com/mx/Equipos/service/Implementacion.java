package com.mx.Equipos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Equipos.dao.EquiposDao;
import com.mx.Equipos.entidad.Equipo;
import com.mx.Equipos.respuesta.Respuesta;

@Service
public class Implementacion implements Metodos{
	@Autowired
	EquiposDao dao;

	@Override
	public Respuesta lista() {
		if(dao.findAll().isEmpty()) {
			return new Respuesta("Lista vacia", null, false);
		}
		return new Respuesta("Lista de equipos", dao.findAll(), true);
	}

	@Override
	public Respuesta guardar(Equipo equipo) {
		if(dao.findById(equipo.getId()) != null) {
			dao.save(equipo);
			return new Respuesta("Se guardo el equipo", equipo, true);
		}else {
			return new Respuesta("El equipo ya existe", null, false);
		}
	}

	@Override
	public Respuesta actualizar(Equipo equipo) {
		if(dao.findById(equipo.getId()) != null) {
			dao.save(equipo);
			return new Respuesta("Se edito el equipo", equipo, true);
		}
		return new Respuesta("El equipo no existe", null, false);
	}

	@Override
	public Respuesta eliminar(Equipo equipo) {
		if(dao.findById(equipo.getId()) != null) {
			dao.delete(equipo);
			return new Respuesta("Se elimino el equipo", equipo, true);
		}
		return new Respuesta("El equipo no existe", null, false);
	}
}
