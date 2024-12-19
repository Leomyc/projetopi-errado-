package com.ecorecicla.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataEntrega;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
