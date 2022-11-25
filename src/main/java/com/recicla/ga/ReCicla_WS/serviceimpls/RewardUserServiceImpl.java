package com.recicla.ga.ReCicla_WS.serviceimpls;

import com.recicla.ga.ReCicla_WS.entities.Rewards_User;
import com.recicla.ga.ReCicla_WS.entities.Ticket;
import com.recicla.ga.ReCicla_WS.repositories.IRewards_UserDAO;
import com.recicla.ga.ReCicla_WS.repositories.ITicketDAO;
import com.recicla.ga.ReCicla_WS.services.IRewardUserService;
import com.recicla.ga.ReCicla_WS.services.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RewardUserServiceImpl implements IRewardUserService {
    @Autowired
    private IRewards_UserDAO ruService;
    @Override
    @Transactional
    public boolean Insert(Rewards_User RU) {
        Rewards_User obj=ruService.save(RU);
        if(obj==null){
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public void delete(int idRU) {
        ruService.deleteById(idRU);
    }

    @Override
    public List<Rewards_User> list() {
        return ruService.findAll();
    }

    @Override
    public Optional<Rewards_User> listarId(int idRU) {
        return Optional.empty();
    }

    @Override
    public Optional<Rewards_User> findRewardUserByID(int idRU) {
        return Optional.of(ruService.findById(idRU).orElse(new Rewards_User()));
    }
}
