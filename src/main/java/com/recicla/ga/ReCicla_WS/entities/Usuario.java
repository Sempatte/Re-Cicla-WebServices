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

    @ManyToOne
    @JoinColumn(name = "Ubication_id", nullable = false)
    private Ubication ubication;

    @ManyToOne
    @JoinColumn(name = "Historial_id", nullable = false)
    private Historial historial;


    public Usuario(){
        super();
    }

    public Usuario(int id, String nombre, String apellido, String email, String telefono, String dni, Boolean esReciclador, Ubication ubication, Historial historial) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.esReciclador = esReciclador;
        this.ubication = ubication;
        this.historial = historial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boolean getEsReciclador() {
        return esReciclador;
    }

    public void setEsReciclador(Boolean esReciclador) {
        this.esReciclador = esReciclador;
    }

    public Ubication getUbication() {
        return ubication;
    }

    public void setUbication(Ubication ubication) {
        this.ubication = ubication;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
}
