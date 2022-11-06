package com.recicla.ga.ReCicla_WS.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.recicla.ga.ReCicla_WS.entities.Usuario;
import com.recicla.ga.ReCicla_WS.repositories.IUsuarioDAO;
import com.recicla.ga.ReCicla_WS.services.IUsuarioService;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private IUsuarioDAO userService;


    @Override
    @Transactional
    public boolean Insert(Usuario usuario) {
        Usuario objUsuario = userService.save(usuario);
        if (objUsuario == null) {
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public void delete(int idUsuario) {
        userService.deleteById(idUsuario);
    }

    @Override
    public List<Usuario> list() {
        return userService.findAll();
    }

    @Override
    public List<Usuario> buscarDireccion(String direccion) {
        return userService.buscarUbicacion(direccion);
    }

    @Override
    public List<Usuario> buscarHistorial(String busquedas) {
        return userService.buscarHistorial(busquedas);
    }



    @Override
    public Optional<Usuario> listarId(int idUsuario) {
        return Optional.empty();
    }

    @Override
    public Optional<Usuario> findUserByID(int idUsuario) {
        return Optional.of(userService.findById(idUsuario).orElse(new Usuario()));
    }

    @Override
    public List<Usuario> buscarUsuario(String UserNames) {
        return userService.BuscarPorNombres(UserNames);
    }
}
