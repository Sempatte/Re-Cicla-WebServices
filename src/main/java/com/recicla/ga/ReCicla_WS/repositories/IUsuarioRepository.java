package com.recicla.ga.ReCicla_WS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.Usuario;

import java.util.List;

@Repository
<<<<<<< Updated upstream:src/main/java/com/recicla/ga/ReCicla_WS/repositories/IUsuarioRepository.java
public interface IUsuarioRepository  extends JpaRepository<Usuario, Integer>{
    @Query("from Usuario p where p.nombre like %:UserNames%")
    List<Usuario> findNameUser(@Param("UserNames") String namePropietario);
=======
public interface IRewardDAO  extends JpaRepository<Reward, Integer>{
    @Query("from Reward r where r.types.Name like %:NameType%")
    List<Reward> buscarTipo(@Param("NameType") String NameType);


>>>>>>> Stashed changes:src/main/java/com/recicla/ga/ReCicla_WS/repositories/IRewardDAO.java
}
