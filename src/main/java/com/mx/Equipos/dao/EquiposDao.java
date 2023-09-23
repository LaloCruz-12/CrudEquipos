package com.mx.Equipos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Equipos.entidad.Equipo;

@Repository
public interface EquiposDao extends JpaRepository<Equipo, Integer>{

}
