package com.recicla.ga.ReCicla_WS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.Ubication;

@Repository
public interface IUbicationRepository extends JpaRepository<Ubication, Integer> {
}
