package com.recicla.ga.ReCicla_WS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario, Integer>{
    @Query("from Usuario p where p.nombre like %:UserNames%")
    List<Usuario> BuscarPorNombres(@Param("UserNames") String namePropietario);

    @Query("from Usuario u where u.ubication.Direccion like %:direccion%")
    List<Usuario> buscarUbicacion(@Param("direccion") String direccion);

    @Query("from Usuario u where u.historial.busquedas like %:busquedas%")
    List <Usuario> buscarHistorial(@Param("busquedas") String busquedas);

    @Query("from Usuario r where r.esReciclador = false")
    List <Usuario> ListarRecolectores();

    @Query("from Usuario r where r.esReciclador = true")
    List <Usuario> ListarRecicladores();
}
