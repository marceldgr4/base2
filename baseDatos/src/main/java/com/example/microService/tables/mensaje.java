package com.example.microService.tables;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsContructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="mensaje")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class mensaje {
    @Id @GenerateValue(strtegy =GenerationType.AUTO)

    private long id_Mensaje;
    private String creador_Mensaje;
    private String destinario_Mensaje;
    private String contenido_Mensaje;
    @Temporal (TemporalType.TIMESTAMP)
    private LocalDateTime create_atMensaje;
    @ManyToOne
    @JoinColumn(name = "id_Usurio", nullable =false)
    public Usuario usuario;

}