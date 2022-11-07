package com.recicla.ga.ReCicla_WS.controllers;


import com.recicla.ga.ReCicla_WS.entities.Ubication;
import com.recicla.ga.ReCicla_WS.services.IUbicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ubications")
public class UbicationController {

    @Autowired
    private IUbicationService ubicationService;

    @PostMapping
    public void Registrar(@RequestBody Ubication u) {
        ubicationService.Insert(u);
    }
    @GetMapping
    public List<Ubication> Listar() {
        return ubicationService.list();
    }
    @PutMapping()
    public void Modificar(@RequestBody Ubication u) {
        ubicationService.Insert(u);
    }

    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id) {
        ubicationService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Ubication> buscar(@RequestBody Ubication ub) throws ParseException {
        List<Ubication> listaUbication;
        ub.setDireccion(ub.getDireccion());
        listaUbication = ubicationService.findUbication(ub.getDireccion());
        return listaUbication;

    }

    @GetMapping("/{id}")
    public Optional<Ubication> findUbicationByID(@PathVariable("id") Integer id) {
        return ubicationService.findUbicationByID(id);
    }
}
