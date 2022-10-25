package com.recicla.ga.ReCicla_WS.repositories;

import com.recicla.ga.ReCicla_WS.entities.Ubication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface IUbicationRepository extends JpaRepository<Ubication, Integer> {
    @Query("from Ubication u where u.Direccion like %:Ubication%")
    List<Ubication> findUbication(@Param("Ubication") String nameUbication);

}
