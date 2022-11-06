package com.recicla.ga.ReCicla_WS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.Score;

import java.util.List;

@Repository
public interface IScoreDAO extends JpaRepository<Score, Integer> {


    @Query("from Score s where s.usuario.nombre like %:nombreUsuario%")
    List<Score> buscarUsuario(@Param("nombreUsuario") String nombreUsuario);

    @Query("from Score s  where s.nEstrellas =  :nEstrellas ")
    List<Score> buscarnEstrellas(@Param("nEstrellas") Integer nEstrellas);

}