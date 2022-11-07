package com.recicla.ga.ReCicla_WS.serviceimpls;

import com.recicla.ga.ReCicla_WS.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.recicla.ga.ReCicla_WS.entities.TipoTicket;
import com.recicla.ga.ReCicla_WS.repositories.ITipoTicketDAO;
import com.recicla.ga.ReCicla_WS.services.ITipoTicketService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TipoTicketServiceImpl implements ITipoTicketService {
    @Autowired
    private ITipoTicketDAO ttR;
    @Override
    @Transactional
    public void Insert(TipoTicket tipoTicket) {ttR.save(tipoTicket);}
    @Override
    public List<TipoTicket> list() { return ttR.findAll();}

    @Override
    @Transactional
    public void delete(int idTipoTicket) {
        ttR.deleteById(idTipoTicket);
    }

    @Override
    public Optional<TipoTicket> findById(int idTipoTicket) {
        return Optional.of(ttR.findById(idTipoTicket).orElse(new TipoTicket()));
    }


    @Override
    public List<TipoTicket> search(String Categoria) {
        return ttR.buscarCategoria(Categoria);
    }
}
