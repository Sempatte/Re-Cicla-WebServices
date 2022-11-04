package com.recicla.ga.ReCicla_WS.controllers;

import com.recicla.ga.ReCicla_WS.entities.Types;
import com.recicla.ga.ReCicla_WS.services.ITypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/types")
public class TypesController {
    @Autowired
    private ITypesService typesService;

    @PostMapping
    public void Registrar(@RequestBody Types p) {
        typesService.Insert(p);
    }
    @GetMapping
    public List<Types> Listar() {
        return typesService.list();
    }
    @PutMapping
    public void Modificar(@RequestBody Types t) {
        typesService.Insert(t);
    }

    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id) {
        typesService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Types> buscar(@RequestBody Types pr) throws ParseException {
        List<Types> listaTypes;
        pr.setName(pr.getName());
        listaTypes = typesService.findTypeName(pr.getName());
        return listaTypes;

    }


}
