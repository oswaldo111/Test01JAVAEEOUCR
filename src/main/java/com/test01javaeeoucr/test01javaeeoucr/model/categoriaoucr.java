package com.test01javaeeoucr.test01javaeeoucr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class categoriaoucr {

    @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      private String nombreoucr;
      private String descripcionoucr;

    public categoriaoucr() {
        
    }

    public categoriaoucr(Long id, String nombreoucr, String descripcionoucr) {
        this.id = id;
        this.nombreoucr = nombreoucr;
        this.descripcionoucr = descripcionoucr;
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

    public String getDescripcionoucr() {
        return descripcionoucr;
    }

    public void setDescripcionoucr(String descripcionoucr) {
        this.descripcionoucr = descripcionoucr;
    }

      
}
