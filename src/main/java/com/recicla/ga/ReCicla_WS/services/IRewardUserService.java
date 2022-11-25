package com.recicla.ga.ReCicla_WS.services;

import com.recicla.ga.ReCicla_WS.entities.Rewards_User;
import com.recicla.ga.ReCicla_WS.entities.Ticket;

import java.util.List;
import java.util.Optional;

public interface IRewardUserService {
    public boolean Insert(Rewards_User RU);
    public void delete(int idRU);
    List<Rewards_User> list();
    Optional<Rewards_User> listarId(int idRU);
    public Optional<Rewards_User> findRewardUserByID(int idRU);
}
