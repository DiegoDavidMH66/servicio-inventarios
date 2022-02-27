package com.example.servicioinventario.models.dao;

import com.example.servicioinventario.models.entity.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoDAO extends JpaRepository<Equipo, Long> {

}
