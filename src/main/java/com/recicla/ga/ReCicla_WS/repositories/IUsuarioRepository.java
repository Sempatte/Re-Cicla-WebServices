package com.recicla.ga.ReCicla_WS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository  extends JpaRepository<Usuario, Integer>{
    @Query("from Usuario p where p.nombre like %:UserNames%")
    List<Usuario> findNameUser(@Param("UserNames") String namePropietario);
}
