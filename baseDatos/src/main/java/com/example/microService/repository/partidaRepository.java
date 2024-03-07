package com.example.microService.repository;
import com.example.microService.tables.Partida;
import com.example.microService..tables.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
    List<Partida> findByCreadorAndCiudad(String creador, String ciudad);

    @Query("SELECT p FROM Partida p WHERE p.creador = ?1 AND p.ciudad = ?2")
    List<Partida> buscarPorCreadorYCiudad(String creador, String ciudad);

    List<Partida> findByDeporteOrProvincia(String deporte, String provincia);

    List<Partida> findByFecha(LocalDateTime fecha);

    List<Partida> findByHoraComienzoBetween(LocalTime horaInicio, LocalTime horaFin);

    List<Partida> findByParticipantesGreaterThanEqualAndSuplentesLessThanEqual(Integer participantes, Integer suplentes);

    List<Partida> findByComentariosLike(String comentarios);

    @Query("SELECT p FROM Partida p WHERE p.comentarios like %?1")
    List<Partida> buscarPorComentarios(String criterio);

    List<Partida> findByUsuariosIn(List<Usuario> usuarios);
}