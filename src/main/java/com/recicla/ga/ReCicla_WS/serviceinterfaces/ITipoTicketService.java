package com.recicla.ga.ReCicla_WS.serviceinterfaces;

import com.recicla.ga.ReCicla_WS.entities.TipoTicket;
import java.util.List;
public interface ITipoTicketService {
    public void Insert(TipoTicket tipoTicket);
    List<TipoTicket> list();
}
