package com.recicla.ga.ReCicla_WS.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.recicla.ga.ReCicla_WS.entities.Usuario;
import com.recicla.ga.ReCicla_WS.repositories.IUsuarioRepository;
import com.recicla.ga.ReCicla_WS.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;
    @Override
    public void Insert(Usuario usuario) {}
    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

}
