package com.recicla.ga.ReCicla_WS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.recicla.ga.ReCicla_WS.entities.Score;
import com.recicla.ga.ReCicla_WS.services.IScoreService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/scores")
public class ScoreController {

    @Autowired
    private IScoreService scoreService;

    @PostMapping
    public void Registrar(@RequestBody Score p) { scoreService.insertar(p);}

    @GetMapping
    public List<Score> Listar() { return scoreService.listar();}
}
