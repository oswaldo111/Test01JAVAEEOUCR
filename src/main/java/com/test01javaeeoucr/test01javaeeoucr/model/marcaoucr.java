package com.test01javaeeoucr.test01javaeeoucr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class marcaoucr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreoucr;

    public marcaoucr() {
        
    }

    public marcaoucr(Long id, String nombre) {
        this.id = id;
        this.nombreoucr = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreoucr() {
        return nombreoucr;
    }

    public void setNombreoucr(String nombreoucr) {
        this.nombreoucr = nombreoucr;
    }

    
}
