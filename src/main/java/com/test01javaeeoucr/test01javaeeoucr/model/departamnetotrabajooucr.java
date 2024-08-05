package com.test01javaeeoucr.test01javaeeoucr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class departamnetotrabajooucr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreoucr;
    private String telefonooucr;
    private String jefeoucr;

    public departamnetotrabajooucr() {
        
    }

    public departamnetotrabajooucr(Long id, String nombreoucr, String telefonooucr, String jefeoucr) {
        this.id = id;
        this.nombreoucr = nombreoucr;
        this.telefonooucr = telefonooucr;
        this.jefeoucr = jefeoucr;
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

    public String getTelefonooucr() {
        return telefonooucr;
    }

    public void setTelefonooucr(String telefonooucr) {
        this.telefonooucr = telefonooucr;
    }

    public String getJefeoucr() {
        return jefeoucr;
    }

    public void setJefeoucr(String jefeoucr) {
        this.jefeoucr = jefeoucr;
    }

    
}
