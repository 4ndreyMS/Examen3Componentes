package com.cenfotec.examen.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Hijo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String tipoPlan;
    private String alergias;

    @JoinColumn(
            nullable = false
    )
    private long adulto;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "hijo"
    )
    private Set<Libro> libro;


    public Hijo() {
    }

    public Hijo(Long id, String nombre, String tipoPlan, String alergias, long adulto, Set<Libro> libro) {
        this.id = id;
        this.nombre = nombre;
        this.tipoPlan = tipoPlan;
        this.alergias = alergias;
        this.adulto = adulto;
        this.libro = libro;
    }

    public Set<Libro> getLibro() {
        return libro;
    }

    public void setLibro(Set<Libro> libro) {
        this.libro = libro;
    }

    public long getAdulto() {
        return adulto;
    }

    public void setAdulto(long adulto) {
        this.adulto = adulto;
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

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

}
