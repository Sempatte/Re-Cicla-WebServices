package com.recicla.ga.ReCicla_WS.services;

import com.recicla.ga.ReCicla_WS.entities.RespuestaSolicitud;
import com.recicla.ga.ReCicla_WS.entities.Solicitud;

import java.util.List;
import java.util.Optional;

public interface ISolicitudService {
    public boolean Insert(Solicitud solicitud);
    public void delete(int idSolicitud);
    List<Solicitud> list();
    Optional<Solicitud> listarId(int idSolicitud);
    List<Solicitud> buscarUsuarioSolicitud(String nombreUsuario);
    List<Solicitud> buscarDistritoSolicitud(String distrito);
    public Optional<Solicitud> findSolicitudByID(int idSolicitud);
    List<RespuestaSolicitud> cantidadSolisxDistrito();
}
