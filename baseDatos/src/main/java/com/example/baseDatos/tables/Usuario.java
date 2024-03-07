package com.example.baseDatos.tables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="USUARIOS_TABLA")
public class Usuario {
    @Id
    private Integer idUsuario;
    private String usernameUsuario;
    private String emailUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private Integer edadUsuario;
    private String passwordUsuario;
    private String rep_passwordUsuario;
    private Boolean enabledUsuario;
    private String fotoUsuario;
    private String rolUsuario;
    private LocalDateTime createUsuario;

    public Usuario() {
    }
}
