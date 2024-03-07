package com.example.microService.tables;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "sugerencias")
@Data
@NoArgsConstructor
public class Sugerencia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuarios;
}

