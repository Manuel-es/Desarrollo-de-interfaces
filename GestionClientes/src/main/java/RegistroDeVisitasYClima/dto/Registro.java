/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroDeVisitasYClima.dto;

import java.util.Date;

/**
 *
 * @author Manuel Escudero
 */
public class Registro {
    
private String nombre;
private Date fecha;
private double minima;
private double maxima;

    public Registro(String nombre, Date fecha, int minima, int maxima) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.minima = minima;
        this.maxima = maxima;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMinima() {
        return minima;
    }

    public void setMinima(double minima) {
        this.minima = minima;
    }

    public double getMaxima() {
        return maxima;
    }

    public void setMaxima(double maxima) {
        this.maxima = maxima;
    }

}
