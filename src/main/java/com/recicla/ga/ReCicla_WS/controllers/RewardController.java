package com.recicla.ga.ReCicla_WS.controllers;

import com.recicla.ga.ReCicla_WS.entities.Reward;

import com.recicla.ga.ReCicla_WS.services.I;
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
        List<Reward> listaUsuarios;
        listaUsuarios = rewardService.buscarRewardName(pr.getNameReward());
        if (listaUsuarios.isEmpty()) {
            listaUsuarios = rewardService.buscarType(pr.getTypes().getName());
        }
        return listaUsuarios;
    }

    @GetMapping("/{id}")
    public Optional<Reward> listarId(@PathVariable("id") Integer id) {
        return rewardService.listarId(id);
    }


}
