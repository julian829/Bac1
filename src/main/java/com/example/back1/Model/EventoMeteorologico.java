package com.example.back1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "evento_meteorologico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventoMeteorologico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false, length = 50)
    private String tipo;

    @Column(nullable = false, length = 100)
    private String ubicacion;

    @Column(nullable = false, length = 50)
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public EventoMeteorologico(String tipo, String ubicacion, String fecha, Usuario usuario) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.usuario = usuario;
    }
}