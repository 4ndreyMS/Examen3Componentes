package com.cenfotec.examen.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Adulto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cedula;
    private String nombre;
    private String apellidos;
    private String direction;
    private String mainPhone;
    private String phone;

    public Adulto() {
    }

    public Adulto(Long id, String cedula, String nombre, String apellidos, String direction, String mainPhone, String phone, Set<Hijo> hijo) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direction = direction;
        this.mainPhone = mainPhone;
        this.phone = phone;
        this.hijo = hijo;
    }

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "adulto"
    )
    private Set<Hijo> hijo;

    public Set<Hijo> getHijo() {
        return hijo;
    }

    public void setHijo(Set<Hijo> hijo) {
        this.hijo = hijo;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getMainPhone() {
        return mainPhone;
    }

    public void setMainPhone(String mainPhone) {
        this.mainPhone = mainPhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
