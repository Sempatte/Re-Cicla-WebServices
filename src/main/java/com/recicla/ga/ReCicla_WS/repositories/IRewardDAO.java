package com.recicla.ga.ReCicla_WS.repositories;

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

    @Query(value = "select r.id,r.name_reward from Reward r join types t on r.types_id=t.id where t.name='Celular'",nativeQuery = true)
    List<Reward>buscarRewardsCelular();
}
