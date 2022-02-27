package com.example.servicioinventario.models.service;

import com.example.servicioinventario.models.entity.Equipo;

import java.util.List;

public interface IEquipoService {
    List<Equipo> obtenerEquipos();

    Equipo obtenerEquipo(Long id);

    Equipo insertarEquipo(Equipo equipo);
}
