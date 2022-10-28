package com.recicla.ga.ReCicla_WS.entities;
import javax.persistence.*;

//Types of Rewards CLASS

@Entity
@Table(name="Types")
public class Types {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name", length = 30, nullable = false)
    private String Name;

    @Column(name = "Description", length = 40, nullable = false)
    private String Description;

    public Types() {}
    public Types(int id, String name, String description) {
        this.id = id;
        Name = name;
        Description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
