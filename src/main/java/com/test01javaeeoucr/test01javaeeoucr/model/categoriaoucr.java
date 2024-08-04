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

      private String nombre;
      private String descripcion;

      public categoriaoucr() {
        
      }

    public categoriaoucr(Long id, String nombre, String descipcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descipcion;
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

    public void setDescripcion(String descipcion) {
        this.descripcion = descipcion;
    }

      
}
