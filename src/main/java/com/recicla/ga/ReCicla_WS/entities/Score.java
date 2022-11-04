package com.recicla.ga.ReCicla_WS.entities;
import javax.persistence.*;

@Entity
@Table(name="Score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="pedidosRealizados", length = 20, nullable = false)
    private int pedidosRealizados;

    @Column(name="pedidosEntregados", length = 20, nullable = false)
    private int pedidosEntregados;

    @Column(name="pedidosCancelados", length = 20, nullable = false)
    private int pedidosCancelados;

    @Column(name="nEstrellas", length = 20, nullable = false)
    private int nEstrellas;

    @ManyToOne
    @JoinColumn(name = "User_id", nullable = false)
    private Usuario usuario;
}
