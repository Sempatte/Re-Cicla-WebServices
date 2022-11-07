package com.recicla.ga.ReCicla_WS.controllers;

import com.recicla.ga.ReCicla_WS.entities.Historial;
import com.recicla.ga.ReCicla_WS.entities.Ubication;
import com.recicla.ga.ReCicla_WS.services.IHistorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/historial")
public class HistorialController {
    @Autowired
    private IHistorialService historialService;

    @PostMapping
    public void Insertar(@RequestBody Historial h) {
        historialService.Insert(h);
    }

    @GetMapping
    public List<Historial> Listar() {
        return historialService.list();
    }

    @PutMapping()
    public void Modificar(@RequestBody Historial h) {
        historialService.Insert(h);
    }

    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id) {
        historialService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Historial> buscar(@RequestBody Historial h) throws ParseException {
        List<Historial> listaHistorial;
        h.setBusquedas(h.getBusquedas());
        listaHistorial = historialService.findHistorial(h.getBusquedas());
        return listaHistorial;
    }

    @GetMapping("/{id}")
    public Optional<Historial> findHistoryById(@PathVariable("id") Integer  id) {
        return historialService.findHistoryById(id);
    }
}
