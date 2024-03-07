package com.example.baseDatos.tables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="PARTIDOS_TABLA")
public class Partida {
@Id
    public Integer idPartida;
    public String creadorPartida;
    public String ciudadPartida;
    public String provinciaPartidoa;
    public LocalDateTime fechaPartido;
    public LocalDateTime horaComienzoPartido;
    public LocalDateTime horaFinalPartido;
    public Integer participantesPartido;
    public Integer suplentesPartido;
    public String comentarios;

    public Partida() {
    }
}