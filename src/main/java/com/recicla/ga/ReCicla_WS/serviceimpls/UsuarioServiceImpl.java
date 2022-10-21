package com.recicla.ga.ReCicla_WS.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.recicla.ga.ReCicla_WS.entities.Usuario;
import com.recicla.ga.ReCicla_WS.repositories.IUsuarioRepository;
import com.recicla.ga.ReCicla_WS.serviceinterfaces.IUsuarioService;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private IUsuarioRepository userService;
    @Override
    public void Insert(Usuario usuario) {
        userService.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return userService.findAll();
    }

    @Override
    public void delete(int idUsuario) {
        userService.deleteById(idUsuario);
    }

    @Override
    public Optional<Usuario> findUserByID(int idUsuario) {
        return Optional.of(userService.findById(idUsuario).orElse(new Usuario()));
    }

    @Override
    public List<Usuario> findNameUser(String UserNames) {
        return userService.findNameUser(UserNames);
    }
}
