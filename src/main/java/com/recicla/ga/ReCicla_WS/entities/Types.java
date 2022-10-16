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
}
