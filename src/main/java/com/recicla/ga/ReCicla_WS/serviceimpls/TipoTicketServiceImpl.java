package com.recicla.ga.ReCicla_WS.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.recicla.ga.ReCicla_WS.entities.TipoTicket;
import com.recicla.ga.ReCicla_WS.repositories.ITipoTicketRepository;
import com.recicla.ga.ReCicla_WS.serviceinterfaces.ITipoTicketService;

import java.util.List;

@Service
public class TipoTicketServiceImpl implements ITipoTicketService {
    @Autowired
    private ITipoTicketRepository ttR;
    @Override
    public void Insert(TipoTicket tipoTicket) {}
    @Override
    public List<TipoTicket> list() { return ttR.findAll();}
}
