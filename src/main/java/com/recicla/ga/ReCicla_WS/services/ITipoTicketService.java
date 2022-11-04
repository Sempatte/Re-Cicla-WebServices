package com.recicla.ga.ReCicla_WS.services;

import com.recicla.ga.ReCicla_WS.entities.TipoTicket;
import java.util.List;
public interface ITipoTicketService {
    public void Insert(TipoTicket tipoTicket);
    List<TipoTicket> list();
    public void delete(int idTipoTicket);
    List<TipoTicket> search(String categoria);
}
