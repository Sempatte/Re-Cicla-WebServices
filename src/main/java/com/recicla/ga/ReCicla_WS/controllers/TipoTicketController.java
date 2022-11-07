package com.recicla.ga.ReCicla_WS.controllers;

import com.recicla.ga.ReCicla_WS.entities.TipoTicket;
import com.recicla.ga.ReCicla_WS.services.ITipoTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/TipoTickets")
public class TipoTicketController {
    @Autowired
    private ITipoTicketService ttService;
    @PostMapping
    public void registrar( @RequestBody TipoTicket t){ttService.Insert(t);}
    @GetMapping
    public List<TipoTicket> listar(){return ttService.list();}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ttService.delete(id);}
    @PutMapping
    public void modificar(@RequestBody TipoTicket tt){ttService.Insert((tt));}
    @PostMapping("/buscar")
    public List<TipoTicket>buscar(@RequestBody TipoTicket tt){return ttService.search(tt.getCategoria());}

    @GetMapping("/{id}")
    public Optional<TipoTicket> listarId(@PathVariable("id") Integer id) {
        return ttService.findById(id);
    }

}
