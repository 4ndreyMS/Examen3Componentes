package com.cenfotec.examen.domain;

import javax.persistence.*;

@Entity
public class Libro {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "deleted", nullable = true)
    private boolean deleted;
    @JoinColumn(
            nullable = false
    )
    private long hijo;

    public Libro() {
    }

    public Libro(String nombre, String descripcion, boolean deleted, long hijo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.deleted = deleted;
        this.hijo = hijo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public long getHijo() {
        return hijo;
    }

    public void setHijo(long hijo) {
        this.hijo = hijo;
    }
}
