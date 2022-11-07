package com.recicla.ga.ReCicla_WS.repositories;

import com.recicla.ga.ReCicla_WS.entities.Historial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface IHistorialDAO  extends JpaRepository<Historial, Integer>{
    @Query("from Historial h where h.busquedas like %:busquedas%")
    List<Historial> findHistorial(@Param("busquedas") String busquedas);
}
