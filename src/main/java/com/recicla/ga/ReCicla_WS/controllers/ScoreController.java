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

    @PutMapping
    public void Modificar(@RequestBody Score s) {
        scoreService.insertar(s);
    }

    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id) {
        scoreService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Score> buscar(@RequestBody Score s) throws ParseException {
        List<Score> listaScore;
        listaScore = scoreService.buscarnEstrellas(s.getnEstrellas());
        if (listaScore == null||listaScore.isEmpty()) {
            listaScore = scoreService.buscarUsuario(s.getUsuario().getNombre());
        }

        return listaScore;

    }

    @GetMapping("/{id}")
    public Optional<Score> listarId(@PathVariable("id") Integer id) {
        return scoreService.listarId(id);
    }

}