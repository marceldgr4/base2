package com.example.baseDatos.tables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity

public class mensaje {
    @Id
    private Integer idMensaje;
    private String creadorMensaje;
    private String destinarioMensaje;
    private LocalDateTime create_atMensaje;
    private String contenidoMensaje;

    public mensaje() {
    }
}