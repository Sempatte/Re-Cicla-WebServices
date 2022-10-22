package com.recicla.ga.ReCicla_WS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.TipoTicket;

import java.util.List;

@Repository
public interface ITipoTicketRepository extends JpaRepository<TipoTicket, Integer> {
    @Query("from TipoTicket tt where tt.Categoria like %:Categoria")
    List<TipoTicket>buscarCategoria(@Param("Categoria")String Categoria);
}
