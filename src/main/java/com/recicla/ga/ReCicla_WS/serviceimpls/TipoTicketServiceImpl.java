package com.recicla.ga.ReCicla_WS.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.recicla.ga.ReCicla_WS.entities.TipoTicket;
import com.recicla.ga.ReCicla_WS.repositories.ITipoTicketDAO;
import com.recicla.ga.ReCicla_WS.services.ITipoTicketService;

import java.util.List;

@Service
public class TipoTicketServiceImpl implements ITipoTicketService {
    @Autowired
    private ITipoTicketDAO ttR;
    @Override
    public void Insert(TipoTicket tipoTicket) {ttR.save(tipoTicket);}
    @Override
    public List<TipoTicket> list() { return ttR.findAll();}

    @Override
    public void delete(int idTipoTicket) {
        ttR.deleteById(idTipoTicket);
    }

    @Override
    public List<TipoTicket> search(String Categoria) {
        return ttR.buscarCategoria(Categoria);
    }
}
