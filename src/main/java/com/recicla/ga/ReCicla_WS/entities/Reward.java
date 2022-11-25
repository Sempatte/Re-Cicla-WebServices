package com.recicla.ga.ReCicla_WS.entities;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Reward")
public class Reward {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NameReward", length = 20, nullable = false)
    private String NameReward;

    @Column(name = "StartDate")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate StartDate;

    @Column(name = "EndDate")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate EndDate;

    @Column(name = "Code", length = 25, nullable = false)
    private String Code;

    @Column(name = "Description", length = 50, nullable = false)
    private String Description;

    @ManyToOne
    @JoinColumn(name = "Types_id", nullable = false)
    private Types types;

    public Reward(int id, String nameReward, LocalDate startDate, LocalDate endDate, String code, String description, Types types) {
        this.id = id;
        NameReward = nameReward;
        StartDate = startDate;
        EndDate = endDate;
        Code = code;
        Description = description;
        this.types = types;
    }

    public Reward(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameReward() {
        return NameReward;
    }

    public void setNameReward(String nameReward) {
        NameReward = nameReward;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }
}
