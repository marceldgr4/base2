package com.example.microService.repository;
import com.example.microSercice.tables.sugerencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface SugerenciaRepository extends JpaRepository<Sugerencia, Long> {
    List<Sugerencia> findByDescripcion(String descripcion);

    List<Sugerencia> findByCreatedAtBetween(LocalDateTime inicio, LocalDateTime fin);

    List<Sugerencia> findByUsuarios(Usuario usuario);
}
