package com.example.servicioinventario.controllers;

import com.example.servicioinventario.models.entity.Equipo;
import com.example.servicioinventario.models.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @GetMapping("/getEquipments")
    public List<Equipo> obtenerEquipos() {
        return equipoService.obtenerEquipos();
    }

    @GetMapping("/getEquipment/{id}")
    public Equipo obtenerEquipo(@PathVariable Long id) {
        return equipoService.obtenerEquipo(id);
    }

    @PostMapping("/insertEquipment")
    public Equipo insertarEqupo(@RequestBody Equipo equipo) {
        return equipoService.insertarEquipo(equipo);
    }
}
