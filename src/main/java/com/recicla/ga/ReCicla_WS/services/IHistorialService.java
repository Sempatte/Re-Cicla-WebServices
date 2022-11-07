package com.recicla.ga.ReCicla_WS.services;

import com.recicla.ga.ReCicla_WS.entities.Historial;

import java.util.List;
import java.util.Optional;

public interface IHistorialService {
    public boolean Insert(Historial historial);
    List<Historial> list();
    public void delete(int idHistorial);
    public Optional<Historial> findHistoryById(int idHistorial);
    List<Historial> findHistorial(String H);

}
