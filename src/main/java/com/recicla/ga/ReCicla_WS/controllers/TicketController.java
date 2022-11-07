package com.recicla.ga.ReCicla_WS.controllers;

import com.recicla.ga.ReCicla_WS.entities.Ticket;
import com.recicla.ga.ReCicla_WS.services.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private ITicketService ticketService;
    @PostMapping
    public void Registrar(@RequestBody Ticket t){ticketService.Insert(t);}
    @GetMapping
    public List<Ticket> Listar(){return ticketService.list();}
    @PutMapping
    public void Modificar(@RequestBody Ticket t){ticketService.Insert(t);}
    @DeleteMapping
    public void Eliminar(@PathVariable("id") Integer id){ticketService.delete(id);}

    public List<Ticket> buscar(@RequestBody Ticket t) throws ParseException{
        List<Ticket> listaTickets;
        listaTickets=ticketService.buscarTicket(t.getEstado());
        if (listaTickets.isEmpty()){
            listaTickets=ticketService.buscarCategoriaTicket(t.getTipoTicket().getCategoria());
        }
        return listaTickets;
    }
    @GetMapping("/{id}")
    public Optional<Ticket> listarID(@PathVariable("id") Integer id){return ticketService.listarId(id);}
}
