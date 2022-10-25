package com.recicla.ga.ReCicla_WS.entities;
import javax.persistence.*;

@Entity
@Table(name="Ubication")
public class Ubication {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String distrito) {
        Distrito = distrito;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="Departamento", length = 40, nullable = false)
    private String Departamento;

    @Column(name="Provincia", length = 40, nullable = false)
    private String Provincia;

    @Column(name="Distrito", length = 40, nullable = false)
    private String Distrito;

    @Column(name = "Direccion", length = 40, nullable = false)
    private String Direccion;


    public Ubication() {
    }

    public Ubication(int id, String Provincia, String Distrito, String Departamento, String Direccion) {
        this.id = id;
        this.Provincia = Provincia;
        this.Distrito = Distrito;
        this.Departamento = Departamento;
        this.Direccion = Direccion;
    }

}
