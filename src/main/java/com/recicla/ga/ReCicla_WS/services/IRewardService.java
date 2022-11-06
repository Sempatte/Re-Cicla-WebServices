package com.recicla.ga.ReCicla_WS.services;

import com.recicla.ga.ReCicla_WS.entities.Reward;

import java.util.List;
import java.util.Optional;

public interface IRewardService {
    public boolean Insert(Reward reward);
    public void delete(int idReward);

    List<Reward> list();
    Optional<Reward> listarId(int idReward);

    List<Reward> buscarType(String idType);
    List<Reward> buscarRewardName(String Name);

    public Optional<Reward> findUserByID(int idReward);

}
