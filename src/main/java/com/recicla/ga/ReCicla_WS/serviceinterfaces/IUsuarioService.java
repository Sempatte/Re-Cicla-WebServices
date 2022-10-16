package com.recicla.ga.ReCicla_WS.serviceinterfaces;

import com.recicla.ga.ReCicla_WS.entities.Usuario;
import java.util.List;

public interface IUsuarioService {
    public void Insert(Usuario usuario);
    List<Usuario> list();
}
