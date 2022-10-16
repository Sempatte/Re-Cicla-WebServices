package com.recicla.ga.ReCicla_WS.entities;
import javax.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="Nombre", length = 40, nullable = false)
    private String nombre;

    @Column(name="Apellido", length = 45, nullable = false)
    private String apellido;

    @Column(name="Email", length = 50, nullable = false)
    private String email;

    @Column(name="Telefono", length = 9, nullable = false)
    private String telefono;

    @Column(name="DNI", length = 8, nullable = false)
    private String dni;

    @Column(name="esReciclador", nullable = false)
    private Boolean esReciclador;

    @Column(name="UbicationID", length = 10, nullable = false)
    private int Ubication_id;

    @Column(name="HistorialID", length = 10, nullable = false)
    private int Historial_id;

    public Usuario(){

    }

    public Usuario(int id, String nombre, String apellido, String email, String telefono, String dni, Boolean esReciclador, int ubication_id, int historial_id) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.esReciclador = esReciclador;
        Ubication_id = ubication_id;
        Historial_id = historial_id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDni() {
        return dni;
    }

    public Boolean getEsReciclador() {
        return esReciclador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEsReciclador(Boolean esReciclador) {
        this.esReciclador = esReciclador;
    }
}
