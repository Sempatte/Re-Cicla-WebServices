package com.recicla.ga.ReCicla_WS.serviceimpls;

import com.recicla.ga.ReCicla_WS.entities.Ticket;
import com.recicla.ga.ReCicla_WS.repositories.ITicketDAO;
import com.recicla.ga.ReCicla_WS.services.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TicketServiceImpl implements ITicketService {

    @Autowired
    private ITicketDAO ticketService;

    @Override
    @Transactional
    public boolean Insert(Ticket ticket) {
        Ticket objTicket=ticketService.save(ticket);
        if(objTicket==null){
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public void delete(int idTicket) {
        ticketService.deleteById(idTicket);
    }

    @Override
    public List<Ticket> list() {
        return ticketService.findAll();
    }

    @Override
    public Optional<Ticket> listarId(int idTicket) {
        return Optional.empty();
    }

    @Override
    public List<Ticket> buscarTicket(String Estado) {
        return null;
    }

    @Override
    public List<Ticket> buscarCategoriaTicket(String Categoria) {
        return null;
    }

    @Override
    public Optional<Ticket> findTicketByID(int idTicket) {
        return Optional.of(ticketService.findById(idTicket).orElse(new Ticket()));
    }
}
