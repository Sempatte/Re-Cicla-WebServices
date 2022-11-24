package com.recicla.ga.ReCicla_WS.services;

import com.recicla.ga.ReCicla_WS.entities.Ticket;

import java.util.List;
import java.util.Optional;

public interface ITicketService {
    public boolean Insert(Ticket ticket);
    public void delete(int idTicket);
    List<Ticket> list();
    Optional<Ticket> listarId(int idTicket);
    List<Ticket>buscarTicket(String Estado);
    List<Ticket>buscarCategoriaTicket(String Categoria);

    List <Ticket> obtenerTicketsImportanciaAlta();
    public Optional<Ticket> findTicketByID(int idTicket);
}
