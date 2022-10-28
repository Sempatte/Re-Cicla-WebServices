package com.recicla.ga.ReCicla_WS.entities;
import javax.persistence.*;


@Entity
@Table(name="TipoTicket")
public class TipoTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "DescripcionCategoria", length = 45, nullable = false)
    private String DescripcionCategoria;

    @Column(name = "Categoria", length = 20, nullable = false)
    private String Categoria;

    @Column(name = "Importancia", length = 45, nullable = false)
    private String Importancia;

    public TipoTicket() {
    }

    public TipoTicket(int id, String descripcionCategoria, String categoria, String importancia) {
        this.id = id;
        DescripcionCategoria = descripcionCategoria;
        Categoria = categoria;
        Importancia = importancia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcionCategoria() {
        return DescripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        DescripcionCategoria = descripcionCategoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getImportancia() {
        return Importancia;
    }

    public void setImportancia(String importancia) {
        Importancia = importancia;
    }
}
