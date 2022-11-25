package com.recicla.ga.ReCicla_WS.controllers;

import com.recicla.ga.ReCicla_WS.entities.RespuestaSolicitud;
import com.recicla.ga.ReCicla_WS.entities.Solicitud;
import com.recicla.ga.ReCicla_WS.services.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {
    @Autowired
    private ISolicitudService solicitudService;
    @PostMapping
    public void Registrar(@RequestBody Solicitud s){solicitudService.Insert(s);}
    @GetMapping
    public List<Solicitud>Listar(){return solicitudService.list();}
    @PutMapping
    public void Modificar(@RequestBody Solicitud s){solicitudService.Insert(s);}
    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id")Integer id){solicitudService.delete(id);}
    @PostMapping("/buscar")
    public List<Solicitud>buscar(@RequestBody Solicitud s)throws ParseException{
        List<Solicitud>listaSolicitudes;
        listaSolicitudes=solicitudService.buscarUsuarioSolicitud(s.getUsuario().getNombre());
        if (listaSolicitudes==null||listaSolicitudes.isEmpty()){
            listaSolicitudes=solicitudService.buscarDistritoSolicitud(s.getUbicacion().getDistrito());
        }
        return listaSolicitudes;
    }
    @GetMapping("/{id}")
    public Optional<Solicitud>listarID(@PathVariable("id")Integer id){return solicitudService.findSolicitudByID(id);}
    @GetMapping("/cantidades")
    List<RespuestaSolicitud>findbyCantidadSolixDis(){
    return  solicitudService.cantidadSolisxDistrito();
    }
}
