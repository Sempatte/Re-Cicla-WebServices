package com.recicla.ga.ReCicla_WS.controllers;

import com.recicla.ga.ReCicla_WS.entities.Rewards_User;
import com.recicla.ga.ReCicla_WS.entities.Solicitud;
import com.recicla.ga.ReCicla_WS.services.IRewardUserService;
import com.recicla.ga.ReCicla_WS.services.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rewardusers")
public class RewardUseroController {
    @Autowired
    private IRewardUserService ruService;
    @PostMapping
    public void Registrar(@RequestBody Rewards_User s){ruService.Insert(s);}
    @GetMapping
    public List<Rewards_User> Listar(){return ruService.list();}
    @PutMapping
    public void Modificar(@RequestBody Rewards_User s){ruService.Insert(s);}
    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id")Integer id){ruService.delete(id);}
    @GetMapping("/{id}")
    public Optional<Rewards_User> listarID(@PathVariable("id")Integer id){return ruService.findRewardUserByID(id);}
}
