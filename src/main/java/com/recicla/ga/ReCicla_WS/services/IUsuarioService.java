package com.recicla.ga.ReCicla_WS.services;

import com.recicla.ga.ReCicla_WS.entities.Usuario;
import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    public void Insert(Usuario usuario);
    List<Usuario> list();
    public void delete(int idUsuario);

    public Optional<Usuario> findUserByID(int idUsuario);
    List<Usuario> findNameUser(String UserNames);
}
