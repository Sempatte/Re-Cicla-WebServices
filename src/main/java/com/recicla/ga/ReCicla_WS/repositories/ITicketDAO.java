package com.recicla.ga.ReCicla_WS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.Ticket;

import java.util.List;
@Repository
public interface ITicketDAO extends JpaRepository<Ticket, Integer>{
    @Query("from Ticket t where t.usuario.nombre like %:nombre%")
    List<Ticket> buscarUsuarioTicket(@Param("nombre") String nombre);

    @Query("from Ticket t where t.tipoTicket.Categoria like %:Categoria%")
    List<Ticket> buscarCategoriaTicket(@Param("Categoria") String Categoria);

    @Query("from Ticket t where t.Estado like %:Estado%")
    List<Ticket> buscarEstadoTicket(@Param("Estado") String Estado);
}
