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
    private float nEstrellas;

    @ManyToOne
    @JoinColumn(name = "User_id", nullable = false)
    private Usuario usuario;

    public Score() {super();}


    public Score(int id, int pedidosRealizados, int pedidosEntregados, int pedidosCancelados, float nEstrellas, Usuario usuario) {
        this.id = id;
        this.pedidosRealizados = pedidosRealizados;
        this.pedidosEntregados = pedidosEntregados;
        this.pedidosCancelados = pedidosCancelados;
        this.nEstrellas = nEstrellas;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void setPedidosRealizados(int pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }

    public int getPedidosEntregados() {
        return pedidosEntregados;
    }

    public void setPedidosEntregados(int pedidosEntregados) {
        this.pedidosEntregados = pedidosEntregados;
    }

    public int getPedidosCancelados() {
        return pedidosCancelados;
    }

    public void setPedidosCancelados(int pedidosCancelados) {
        this.pedidosCancelados = pedidosCancelados;
    }

    public float getnEstrellas() {
        return nEstrellas;
    }

    public void setnEstrellas(float nEstrellas) {
        this.nEstrellas = nEstrellas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}