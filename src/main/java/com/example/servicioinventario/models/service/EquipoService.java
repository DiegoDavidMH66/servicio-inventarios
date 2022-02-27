package com.example.servicioinventario.models.service;

import com.example.servicioinventario.models.dao.EquipoDAO;
import com.example.servicioinventario.models.entity.Equipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EquipoService implements IEquipoService {

    @Autowired
    private EquipoDAO equipoDAO;

    @Override
    @Transactional
    public List<Equipo> obtenerEquipos() {
        return equipoDAO.findAll();
    }

    @Override
    @Transactional
    public Equipo obtenerEquipo(Long id) {
        return equipoDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Equipo insertarEquipo(Equipo equipo) {
        return equipoDAO.save(equipo);
    }
}
