package com.recicla.ga.ReCicla_WS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.recicla.ga.ReCicla_WS.entities.Usuario;
import com.recicla.ga.ReCicla_WS.serviceinterfaces.IUsuarioService;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService userService;

    @PostMapping
    public void Registrar(@RequestBody Usuario p) {
        userService.Insert(p);
    }
    @GetMapping
    public List<Usuario> Listar() {
        return userService.list();
    }
    @PutMapping
    public void Modificar(@RequestBody Usuario p) {
        userService.Insert(p);
    }

    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id) {
        userService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Usuario> buscar(@RequestBody String name) throws ParseException {
        List<Usuario> listaPropietarios;
        listaPropietarios = userService.findNameUser(name);
        return listaPropietarios;

    }
}
