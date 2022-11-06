package com.recicla.ga.ReCicla_WS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.recicla.ga.ReCicla_WS.entities.Usuario;
import com.recicla.ga.ReCicla_WS.services.IUsuarioService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;


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
    public List<Usuario> buscar(@RequestBody Usuario pr) throws ParseException { // Busca por Nombres o Direccion
        List<Usuario> listaUsuarios;
        listaUsuarios = userService.buscarUsuario(pr.getNombre());
        if (listaUsuarios.isEmpty()) {
            listaUsuarios = userService.buscarDireccion(pr.getUbication().getDireccion());
        }

        return listaUsuarios;

    }

    @GetMapping("/{id}")
    public Optional<Usuario> listarId(@PathVariable("id") Integer id) {
        return userService.listarId(id);
    }


}
