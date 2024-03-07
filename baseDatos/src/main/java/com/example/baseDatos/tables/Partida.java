package com.example.baseDatos.tables;




mport jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "PARTIDOS_TABLA")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Partida {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String creador_partida;
    private String ciudad_partida;
    private String deporte_partida;
    private String provincia_partida;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecha;
    @Temporal(TemporalType.TIME)
    private LocalTime horaComienzo;
    @Temporal(TemporalType.TIME)
    private LocalTime horaFinal;
    private Integer participantes_partida;
    private Integer suplentes_partida;
    private String comentarios_partida;
    @ManyToMany(mappedBy = "partidas")
    private List<Usuario> usuarios;
}


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name=)
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