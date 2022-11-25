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

    @PostMapping("/Registrar")
    public void Registrar(@RequestBody Usuario p) {
        userService.Insert(p);
    }
    @GetMapping
    public List<Usuario> Listar() {
        return userService.ListarTodosLosUsuarios();
    }

    @GetMapping("/ListarRecolectores")
    public List<Usuario> ListarRecolectores() {
        return userService.ListarRecolectores();
    }

    @GetMapping("/ListarRecicladores")
    public List<Usuario> ListarRecicladores() {
        return userService.ListarRecicladores();
    }
    @PutMapping("/Modificar")
    public void Modificar(@RequestBody Usuario p) {
        userService.Insert(p);
    }

    @DeleteMapping("{id}")
    public void Eliminar(@PathVariable("id") Integer id) {
        userService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Usuario> buscar(@RequestBody Usuario pr) throws ParseException { // Busca por Nombres o Direccion
        List<Usuario> listaUsuarios;
        listaUsuarios = userService.buscarUsuario(pr.getNombre());
        if (listaUsuarios == null) {
            listaUsuarios = userService.buscarDireccion(pr.getUbication().getDireccion());
        }

        return listaUsuarios;
    }

    @GetMapping("/{id}")
    public Optional<Usuario> listarId(@PathVariable("id") Integer id) {
        return userService.findUserByID(id);
    }

    @GetMapping("/ListarQuery1")
    public List<Usuario> ListarQueryDistrito() {
        return userService.ListarQueryDistrito();
    }

    @GetMapping("/ListarQuery2")
    public List<Usuario> ListarQuery2() {
        return userService.ListarQuery2();
    }

    @GetMapping("/ListarQuery3")
    public List<Usuario> ListarQuery3() {
        return userService.ListarQuery3();
    }
}
