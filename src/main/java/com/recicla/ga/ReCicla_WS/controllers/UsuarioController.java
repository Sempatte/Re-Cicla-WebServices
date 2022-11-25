package com.recicla.ga.ReCicla_WS.controllers;

import com.recicla.ga.ReCicla_WS.entities.Score;
import com.recicla.ga.ReCicla_WS.services.IScoreService;
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
    @Autowired
    private IScoreService scoreService;

    @PostMapping("/Registrar")
    public void Registrar(@RequestBody Usuario p) {
        userService.Insert(p);
        Score score = new Score();
        score.setUsuario(p);
        scoreService.insertar(score);
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
        try {
            scoreService.deleteScoreByUsuario(id);
        } catch (Exception e) { // El usuario no tiene score
            System.out.println(e.getMessage());
        }
        userService.delete(id);
    }

    @PostMapping("/BuscarPorNombres")
    public List<Usuario> BuscarPorNombres(@RequestBody String NombreDelUsuario){ // Busca por Nombres
        return userService.buscarUsuarioPorNombres(NombreDelUsuario);
    }

    @PostMapping("/BuscarPorDireccion")
    public List<Usuario> BuscarPorDireccion(@RequestBody String DireccionDelUsuario){ // Busca por Direccion
        return userService.buscarDireccion(DireccionDelUsuario);
    }

    @GetMapping("/{id}")
    public Optional<Usuario> listarId(@PathVariable("id") Integer id) {
        return userService.findUserByID(id);
    }

    @GetMapping("/UsuariosDestacados")
    public List<Score> ListarScoresMayoresA3_5() {
        return userService.obtenerScoreMayorA3_5();
    }

    @GetMapping("/ListarQueryDistrito") // QUERY Giancarlo
    public List<Usuario> ListarQueryDistrito() {
        return userService.ListarQueryDistrito();
    }

    @GetMapping("/SSSSSeleccionarPorImportancia") // QUERY Giancarlo
    public List<Usuario> ListarQuery2() {
        System.out.println("ListarQuery2");
        return userService.ListarQuery2();
    }

    @GetMapping("/DescripcionRecompensasDeUsuario")  // QUERY Brian
    public List<Usuario> ListarQuery3() {
        return userService.ListarQuery3();
    }

}
