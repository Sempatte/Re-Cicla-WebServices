package com.recicla.ga.ReCicla_WS.services;

import com.recicla.ga.ReCicla_WS.entities.Usuario;
import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    public boolean Insert(Usuario usuario);
    public void delete(int idUsuario);
    Optional<Usuario> listarId(int idUsuario);

    List<Usuario> ListarTodosLosUsuarios();
    List<Usuario> ListarRecolectores();
    List<Usuario> ListarRecicladores();

    List<Usuario> buscarDireccion(String direccion);
    List<Usuario> buscarHistorial(String busquedas);
    List<Usuario> buscarUsuario(String UserNames);
    List <Usuario> ListarQueryDistrito();
    List <Usuario> ListarQuery2();
    List <Usuario> ListarQuery3();
    public Optional<Usuario> findUserByID(int idUsuario);

}
