package com.recicla.ga.ReCicla_WS.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="Ticket")
public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTicket;

    @Column(name="DescripcionReclamo", length = 40, nullable = false)
    private String DescripcionReclamo;

    @Column(name="Estado", length = 40, nullable = false)
    private String Estado;

    @Column(name = "Fecha")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate Fecha;


    @ManyToOne
    @JoinColumn(name = "User_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "TipoTicket_id", nullable = false)
    private TipoTicket tipoTicket;

    public Ticket(){
        super();
    }

    public Ticket(int idTicket, String descripcionReclamo, String estado, LocalDate fecha, Usuario usuario, TipoTicket tipoTicket) {
        this.idTicket = idTicket;
        DescripcionReclamo = descripcionReclamo;
        Estado = estado;
        Fecha = fecha;
        this.usuario = usuario;
        this.tipoTicket = tipoTicket;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getDescripcionReclamo() {
        return DescripcionReclamo;
    }

    public void setDescripcionReclamo(String descripcionReclamo) {
        DescripcionReclamo = descripcionReclamo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoTicket getTipoTicket() {
        return tipoTicket;
    }

    public void setTipoTicket(TipoTicket tipoTicket) {
        this.tipoTicket = tipoTicket;
    }
}
