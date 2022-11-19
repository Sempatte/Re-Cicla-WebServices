package com.recicla.ga.ReCicla_WS.entities;
import javax.persistence.*;

import javax.persistence.*;
@Table(name="AdminUser")
@Entity

public class AdminUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="nombre", length = 40, nullable = false)
    private String nombre;

    @Column(name="email", length = 50, nullable = false)
    private String email;

    @Column(name="username", length = 20, nullable = false)
    private String username;

    @Column(name="password", length = 255, nullable = false)
    private String password;

    public AdminUser() {
        super();
    }

    public AdminUser(int id, String nombre, String email, String username, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.username = username;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
