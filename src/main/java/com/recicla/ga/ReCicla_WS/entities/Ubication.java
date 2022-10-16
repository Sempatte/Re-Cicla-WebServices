package com.recicla.ga.ReCicla_WS.entities;
import javax.persistence.*;

@Entity
@Table(name="Ubication")
public class Ubication {
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
}
