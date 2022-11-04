package com.recicla.ga.ReCicla_WS.entities;
import javax.persistence.*;

@Entity
@Table(name="Rewards_User")
public class Rewards_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Claimed", nullable = false)
    private boolean Claimed;

    @ManyToOne
    @JoinColumn(name = "Reward_id", nullable = false)
    private Reward reward;

    @ManyToOne
    @JoinColumn(name = "User_id", nullable = false)
    private Usuario usuario;

    public Rewards_User(){
        super();
    }

    public Rewards_User(int id, boolean claimed, Reward reward, Usuario usuario) {
        this.id = id;
        Claimed = claimed;
        this.reward = reward;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isClaimed() {
        return Claimed;
    }

    public void setClaimed(boolean claimed) {
        Claimed = claimed;
    }

    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
