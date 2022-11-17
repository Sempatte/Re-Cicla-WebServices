package com.recicla.ga.ReCicla_WS.repositories;

import com.recicla.ga.ReCicla_WS.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISolicitudDAO extends JpaRepository<Ticket, Integer> {

}
