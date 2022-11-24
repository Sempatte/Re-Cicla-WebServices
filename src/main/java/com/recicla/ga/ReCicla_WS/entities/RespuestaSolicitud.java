package com.recicla.ga.ReCicla_WS.entities;

public class RespuestaSolicitud {
    private String cantidad;
    private String distrito;

    public RespuestaSolicitud() {
    }

    public RespuestaSolicitud(String cantidad, String distrito) {
        this.cantidad = cantidad;
        this.distrito = distrito;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
}
