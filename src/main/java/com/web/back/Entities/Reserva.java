package com.web.back.Entities;


import java.time.LocalDateTime;

import com.back.demo.Model.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "reserva")
public class Reserva {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
a
    @NotNull(message = "User is mandatory")
    @JoinColumn(name = "usuario_id")
    private User usuario;

    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @NotNull(message = "cancha is mandatory")
    @JoinColumn(name = "cancha_id")
    private Cancha cancha;


    @NotNull(message = "fechaInicio is mandatory")
    @Column(name = "fecha_inicio")
    private LocalDateTime fechaInicio;

    @NotNull(message = "fechaFin is mandatory")
    @Column(name = "fecha_fin")

    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;*/
}
