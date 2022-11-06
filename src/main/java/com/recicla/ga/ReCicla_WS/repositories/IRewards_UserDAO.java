package com.recicla.ga.ReCicla_WS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.recicla.ga.ReCicla_WS.entities.Rewards_User;

import java.util.List;

@Repository
public interface IRewards_UserDAO extends JpaRepository<Rewards_User, Integer> {
    @Query("from Rewards_User rw where rw.reward.NameReward like %:nameReward%")
    List<Rewards_User> buscarReward(@Param("nameReward") String nameReward);

    @Query("from Rewards_User rw where rw.usuario.nombre like %:nombreUsuario%")
    List<Rewards_User> buscarUsuario(@Param("nombreUsuario") String nombreUsuario);
}
