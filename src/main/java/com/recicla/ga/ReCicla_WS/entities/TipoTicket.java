package com.recicla.ga.ReCicla_WS.entities;
import javax.persistence.*;


@Entity
@Table(name="TipoTicket")
public class TipoTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NameEstado", length = 15, nullable = false)
    private String NameEstado;

    @Column(name = "Descripcion", length = 20, nullable = false)
    private String Descripcion;

    @Column(name = "Solicitud_Id", length = 10, nullable = false)
    private int Solicitud_Id;
}
