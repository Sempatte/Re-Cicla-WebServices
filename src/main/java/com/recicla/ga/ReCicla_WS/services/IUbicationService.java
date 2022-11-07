package com.recicla.ga.ReCicla_WS.services;

import com.recicla.ga.ReCicla_WS.entities.Ubication;
import java.util.List;
import java.util.Optional;

public interface IUbicationService {
    public boolean Insert(Ubication ubication);
    List<Ubication> list();

    public void delete(int idUbication);

    public Optional<Ubication> findUbicationByID(int idUbication);
    List<Ubication> findUbication(String Ubication);
}
