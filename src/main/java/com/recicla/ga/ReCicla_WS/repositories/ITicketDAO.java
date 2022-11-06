package com.recicla.ga.ReCicla_WS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.Ticket;

import java.util.List;
@Repository
public interface ITicketDAO extends JpaRepository<Ticket, Integer>{
    @Query("from Ticket t where t.usuario.nombre like %:nombreUsuario%")
    List<Ticket> buscarUsuario(@Param("nombreUsuario") String nombreUsuario);

    @Query("from Ticket t where t.tipoTicket.Categoria like %:categoriaTicket%")
    List<Ticket> buscarCategoria(@Param("categoriaTicket") String categoriaTicket);
}
