package com.example.servicioinventario.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "equipo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Equipo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipo")
    private Long idEquipo;
    private String nombre;
    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;
    @Column(name = "hora_registro")
    private LocalTime horaRegistro;
    private Integer estado;
    private Float precio;
    @Column(name = "id_usuario")
    private Integer idUsuario;
}
