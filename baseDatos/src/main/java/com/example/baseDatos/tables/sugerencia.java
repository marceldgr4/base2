package com.example.baseDatos.tables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class sugerencia {
    @Id
    private Integer idSugerencia;
    private String descripcionSugerencia;
    private LocalDateTime create_atSugerencia;

    public sugerencia() {
    }
}
