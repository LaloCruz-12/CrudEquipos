package com.mx.Equipos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Equipos.entidad.Equipo;
import com.mx.Equipos.respuesta.Respuesta;
import com.mx.Equipos.service.Implementacion;

@RestController
@CrossOrigin
@RequestMapping("equipos")
public class EquiposWS {
	@Autowired
	Implementacion imp;
	
	@GetMapping("lista")
	public Respuesta lista(){
		return imp.lista();
	}
	
	@PostMapping("guardar")
	public Respuesta guardar(@RequestBody Equipo equipo) {
		return imp.guardar(equipo);
	}
	
	@PostMapping("actualizar")
	public Respuesta actualizar(@RequestBody Equipo equipo) {
		return imp.actualizar(equipo);
	}
	
	@PostMapping("eliminar")
	public Respuesta eliminar(@RequestBody Equipo equipo) {
		return imp.eliminar(equipo);
	}
}
