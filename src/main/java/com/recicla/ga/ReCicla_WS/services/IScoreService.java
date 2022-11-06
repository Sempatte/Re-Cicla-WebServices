package com.recicla.ga.ReCicla_WS.services;

import com.recicla.ga.ReCicla_WS.entities.Score;

import java.util.List;
import java.util.Optional;

public interface IScoreService {
    public boolean insertar(Score score);
    public void eliminar(int idScore);
    Optional<Score> listarId(int idScore);
    List<Score> listar();

    List<Score> buscarUsuario(String nombreUsuario);
    List<Score> buscarnEstrellas(Integer nEstrellas);

    public Optional<Score> findScoreByID(int idScore);
}