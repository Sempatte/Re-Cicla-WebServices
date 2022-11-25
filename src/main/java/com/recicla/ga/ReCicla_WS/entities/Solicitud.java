package com.recicla.ga.ReCicla_WS.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="Solicitud")
public class Solicitud implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSolicitud;

    @Column(name="Fecha")
    @JsonSerialize(using= ToStringSerializer.class)
    private LocalDate Fecha;

    @Column(name = "Descripcion",length = 60,nullable = false)
    private String Descripcion;

    @ManyToOne
    @JoinColumn(name = "User_id",nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "Ubication_id", nullable = false)
    private Ubication ubicacion;

    public Solicitud() {
        super();
    }

    public Solicitud(int idSolicitud, LocalDate fecha, String descripcion, Usuario usuario, Ubication ubicacion) {
        this.idSolicitud = idSolicitud;
        Fecha = fecha;
        Descripcion = descripcion;
        this.usuario = usuario;
        this.ubicacion = ubicacion;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Ubication getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubication ubicacion) {
        this.ubicacion = ubicacion;
    }
}
