package com.example.microService.repository

import com.example.microService.tables.mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface mensajeRepository extends JpaRepository<Mensaje, Long> {

}