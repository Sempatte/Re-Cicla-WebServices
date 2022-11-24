package com.recicla.ga.ReCicla_WS.repositories;

import com.recicla.ga.ReCicla_WS.entities.Solicitud;
import com.recicla.ga.ReCicla_WS.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISolicitudDAO extends JpaRepository<Solicitud, Integer> {
    @Query("from Solicitud s where s.usuario.nombre like %:nombre%")
    List<Solicitud> buscarUsuarioSolicitud(@Param("nombre") String nombre);

    @Query("from Solicitud s where s.ubicacion.Distrito like %:Distrito")
    List<Solicitud>buscarDistritoSolicitud(@Param("Distrito") String Distrito);
    @Query(value = "select u.Distrito,count(s.idSolicitud) from solicitud s join ubicacion u on s.id=u.id group by u.Distrito",nativeQuery = true)
    List<String[]> cantsoldistrict();
}
