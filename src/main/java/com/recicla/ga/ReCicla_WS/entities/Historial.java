package com.recicla.ga.ReCicla_WS.entities;
import javax.persistence.*;
@Entity
@Table(name="Historial")
public class Historial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "busquedas", length = 50, nullable = false)
    private String busquedas;

    public Historial(){
        super();
    }

    public Historial(int id, String busquedas) {
        this.id = id;
        this.busquedas = busquedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusquedas() {
        return busquedas;
    }

    public void setBusquedas(String busquedas) {
        this.busquedas = busquedas;
    }
}
