package com.recicla.ga.ReCicla_WS.controllers;

import com.recicla.ga.ReCicla_WS.entities.Reward;

import com.recicla.ga.ReCicla_WS.services.IRewardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/reward")
public class RewardController {
    @Autowired
    private IRewardService rewardService;

    @PostMapping
    public void Registrar(@RequestBody Reward r) {
        rewardService.Insert(r);
    }

    @GetMapping
    public List<Reward> Listar() { return rewardService.list();}

    @PutMapping
    public void Modificar(@RequestBody Reward r) {
        rewardService.Insert(r);
    }

    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id) {
        rewardService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Reward> buscar(@RequestBody Reward pr) throws ParseException {
        List<Reward> listaRewards;
        listaRewards = rewardService.buscarRewardName(pr.getNameReward());
        if (listaRewards.isEmpty()) {
            listaRewards = rewardService.buscarType(pr.getTypes().getName());
        }
        return listaRewards;
    }

    @GetMapping("/{id}")
    public Optional<Reward> findRewardByID(@PathVariable("id") Integer id) {
        return rewardService.findRewardByID(id);
    }


}
