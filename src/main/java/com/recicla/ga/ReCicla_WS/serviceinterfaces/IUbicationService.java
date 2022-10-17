package com.recicla.ga.ReCicla_WS.serviceinterfaces;

import com.recicla.ga.ReCicla_WS.entities.Ubication;
import java.util.List;

public interface IUbicationService {
    public void Insert(Ubication ubication);
    List<Ubication> list();
}
