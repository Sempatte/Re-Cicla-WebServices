package com.recicla.ga.ReCicla_WS.repositories;

import com.recicla.ga.ReCicla_WS.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.Reward;

import java.util.List;

@Repository
public interface IRewardDAO  extends JpaRepository<Reward, Integer>{
    @Query("from Reward r where r.types.Name like %:NameType%")
    List<Reward> buscarTipo(@Param("NameType") String NameType);
    @Query("from Reward r where r.NameReward like %:NameReward%")
    List<Usuario> buscarPorNombre(@Param("NameReward") String NameReward);

}
