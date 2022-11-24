package com.recicla.ga.ReCicla_WS.serviceimpls;

import com.recicla.ga.ReCicla_WS.entities.RespuestaSolicitud;
import com.recicla.ga.ReCicla_WS.entities.Solicitud;
import com.recicla.ga.ReCicla_WS.repositories.ISolicitudDAO;
import com.recicla.ga.ReCicla_WS.services.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class SolicitudServiceImpl implements ISolicitudService {
    @Autowired
    private ISolicitudDAO solicitudService;

    @Override
    @Transactional
    public boolean Insert(Solicitud solicitud) {
        Solicitud objSoli=solicitudService.save(solicitud);
        if (objSoli==null){
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public void delete(int idSolicitud) {
        solicitudService.deleteById(idSolicitud);
    }

    @Override
    public List<Solicitud> list() {
        return solicitudService.findAll();
    }

    @Override
    public Optional<Solicitud> listarId(int idSolicitud) {
        return Optional.empty();
    }

    @Override
    public List<Solicitud> buscarUsuarioSolicitud(String nombreUsuario) {
        return solicitudService.buscarUsuarioSolicitud(nombreUsuario);
    }

    @Override
    public List<Solicitud> buscarDistritoSolicitud(String distrito) {
        return solicitudService.buscarDistritoSolicitud(distrito);
    }

    @Override
    public Optional<Solicitud> findSolicitudByID(int idSolicitud) {
        return Optional.of(solicitudService.findById(idSolicitud).orElse(new Solicitud()));
    }

    @Override
    public List<RespuestaSolicitud> cantidadSolisxDistrito() {
        List<RespuestaSolicitud>lista=new ArrayList<>();
        solicitudService.cantsoldistrict().forEach(y->{
            RespuestaSolicitud r=new RespuestaSolicitud();
            r.setDistrito(y[0]);
            r.setCantidad(y[1]);
            lista.add(r);
        });
        return lista;

    }
}
