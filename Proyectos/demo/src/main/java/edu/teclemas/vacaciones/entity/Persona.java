package edu.teclemas.vacaciones.entity;

import java.time.LocalDate;

import edu.teclemas.vacaciones.App;

public class Persona {

    private String identificacion;
    private LocalDate feInicio;
    private LocalDate feFin;

    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public LocalDate getFeInicio() {
        return feInicio;
    }
    public void setFeInicio(LocalDate feInicio) {
        this.feInicio = feInicio;
    }
    public LocalDate getFeFin() {
        return feFin;
    }
    public void setFeFin(LocalDate feFin) {
        this.feFin = feFin;
    }

    
    
}
