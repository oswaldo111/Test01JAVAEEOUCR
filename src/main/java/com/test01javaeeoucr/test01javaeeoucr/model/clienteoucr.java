package com.test01javaeeoucr.test01javaeeoucr.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class clienteoucr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombreoucr;
    private String direccionoucr;
    private LocalDate fechanacimientooucr;
    private double sueldooucr;
    private byte estatusoucr;
    
    public clienteoucr() {
        
    }

    public clienteoucr(Long id, String nombreoucr, String direccionoucr, LocalDate fechanacimientooucr,
            double sueldooucr, byte estatusoucr) {
        this.id = id;
        this.nombreoucr = nombreoucr;
        this.direccionoucr = direccionoucr;
        this.fechanacimientooucr = fechanacimientooucr;
        this.sueldooucr = sueldooucr;
        this.estatusoucr = estatusoucr;
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

    public String getDireccionoucr() {
        return direccionoucr;
    }

    public void setDireccionoucr(String direccionoucr) {
        this.direccionoucr = direccionoucr;
    }

    public LocalDate getFechanacimientooucr() {
        return fechanacimientooucr;
    }

    public void setFechanacimientooucr(LocalDate fechanacimientooucr) {
        this.fechanacimientooucr = fechanacimientooucr;
    }

    public double getSueldooucr() {
        return sueldooucr;
    }

    public void setSueldooucr(double sueldooucr) {
        this.sueldooucr = sueldooucr;
    }

    public byte getEstatusoucr() {
        return estatusoucr;
    }

    public void setEstatusoucr(byte estatusoucr) {
        this.estatusoucr = estatusoucr;
    }

    
}
