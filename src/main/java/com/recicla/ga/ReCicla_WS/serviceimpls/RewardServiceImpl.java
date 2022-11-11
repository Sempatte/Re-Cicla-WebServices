package com.recicla.ga.ReCicla_WS.serviceimpls;

import com.recicla.ga.ReCicla_WS.entities.Reward;
import com.recicla.ga.ReCicla_WS.repositories.IRewardDAO;
import com.recicla.ga.ReCicla_WS.services.IRewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class RewardServiceImpl implements IRewardService {
    @Autowired
    private IRewardDAO rewardService;


    @Override
    @Transactional
    public boolean Insert(Reward reward) {
        Reward objReward = rewardService.save(reward);
        if (objReward == null) {
            return false;
        }
        return true;
    }

    @Override
    public void delete(int idReward) {
        rewardService.deleteById(idReward);
    }

    @Override
    public List<Reward> list() {
        return rewardService.findAll();
    }


    @Override
    public Optional<Reward> listarId(int idReward) {
        return Optional.empty();
    }

    @Override
    public List<Reward> buscarType(String idType) {
        return null;
    }

    @Override
    public List<Reward> buscarRewardName(String nameReward) {
        return rewardService.buscarRewardName(nameReward);
    }

    @Override
    public Optional<Reward> findRewardByID(int idReward) {
        return Optional.of(rewardService.findById(idReward).orElse(new Reward()));
    }

}
