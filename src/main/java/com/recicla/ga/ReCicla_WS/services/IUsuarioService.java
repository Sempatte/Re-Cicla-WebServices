package com.recicla.ga.ReCicla_WS.services;

import com.recicla.ga.ReCicla_WS.entities.Usuario;
import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    public boolean Insert(Usuario usuario);
    public void delete(int idUsuario);
    Optional<Usuario> listarId(int idUsuario);

    List<Usuario> list();

    List<Usuario> buscarDireccion(String direccion);
    List<Usuario> buscarHistorial(String idHistorial);
    List<Usuario> buscarUsuario(String UserNames);


    public Optional<Usuario> findUserByID(int idUsuario);

}
