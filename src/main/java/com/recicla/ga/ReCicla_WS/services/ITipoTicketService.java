package com.recicla.ga.ReCicla_WS.services;

import com.recicla.ga.ReCicla_WS.entities.TipoTicket;
import java.util.List;
import java.util.Optional;

public interface ITipoTicketService {
    public void Insert(TipoTicket tipoTicket);
    List<TipoTicket> list();

    public void delete(int idTipoTicket);

    public Optional<TipoTicket> findById(int idTipoTicket);
    List<TipoTicket> search(String categoria);
}
