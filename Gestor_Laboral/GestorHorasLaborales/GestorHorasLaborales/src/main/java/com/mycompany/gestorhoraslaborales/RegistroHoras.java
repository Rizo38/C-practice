/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorhoraslaborales;

import java.time.LocalDateTime;

public class RegistroHoras {

    private RegistroTrabajador trabajador;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private double horasDiurnas;
    private double horasMixtas;
    private double horasNocturnas;
    private double horasExtras;
    private boolean aprobado;
    private String observaciones;
    private String idHora;
    private int cantidadHoras;

    public RegistroHoras() {
    }

    public RegistroHoras(LocalDateTime horaEntrada, LocalDateTime horaSalida, double horasDiurnas,
            double horasMixtas, double horasNocturnas, double horasExtras,
            boolean aprobado, String observaciones, String idHora, int cantidadHoras, RegistroTrabajador trabajador) {
        this.idHora = idHora;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.horasDiurnas = horasDiurnas;
        this.horasMixtas = horasMixtas;
        this.horasNocturnas = horasNocturnas;
        this.horasExtras = horasExtras;
        this.aprobado = aprobado;
        this.observaciones = observaciones;
        this.cantidadHoras = cantidadHoras;
        this.trabajador = trabajador; // trabajador asosciado a este registro de horas
    }


    // su funcion es obtener el trabajador asociado a este registro de horas, para poder obtener su id y nombre
    public String getIdTrabajador() {
        if (trabajador != null) {
            return trabajador.getIdTrabajador();
        }
        return null; // o lanzar una excepción si no hay trabajador asociado
    }

    /* 
    public String getIdTrabajador() {
        return trabajador != null ? trabajador.getIdTrabajador() : null;
    }    
    
    Este metodo es con el operador ternario, solo lo escribo para recordarlo
    */

    public void setTrabajador(RegistroTrabajador trabajador) {
        this.trabajador = trabajador;
    }

    // para eviar NullPinterException, se puede crear un metodo que devuelva el nombre del trabajador
    public String getNombreTrabajador() {
        if (trabajador != null) {
            return trabajador.getNombre();
        } else {
            return "Trabajador no asignado";
        }
    }

    // otro metoddo para obtener mas seguridad
    public RegistroTrabajador getTrabajador() {
        return trabajador;
    }

    public String getIdHora() {
        return idHora;
    }

    public void setIdHora(String idHora) {
        this.idHora = idHora;
    }


    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }


    public double getHorasDiurnas() {
        return horasDiurnas;
    }

    public void setHorasDiurnas(double horasDiurnas) {
        this.horasDiurnas = horasDiurnas;
    }

    public double getHorasMixtas() {
        return horasMixtas;
    }

    public void setHorasMixtas(double horasMixtas) {
        this.horasMixtas = horasMixtas;
    }

    public double getHorasNocturnas() {
        return horasNocturnas;
    }

    public void setHorasNocturnas(double horasNocturnas) {
        this.horasNocturnas = horasNocturnas;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
} // class

