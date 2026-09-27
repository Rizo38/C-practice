/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorhoraslaborales;

import java.time.LocalDateTime;

public class AsientoContable {

    private RegistroHoras registroHoras;
    private double tarifaHora;
    private double montoTotal;
    private LocalDateTime fechaCreacion;
    private int idAsiento;

    public AsientoContable() {
    }

    public AsientoContable(RegistroHoras registroHoras, double tarifaHora,
            double montoTotal, LocalDateTime fechaCreacion, int idAsiento) {
        this.registroHoras = registroHoras;
        this.tarifaHora = tarifaHora;
        this.montoTotal = montoTotal;
        this.fechaCreacion = fechaCreacion;
        this.idAsiento = idAsiento;
    }

    public RegistroHoras getRegistroHoras() {
        return registroHoras;
    }

    public void setRegistroHoras(RegistroHoras registroHoras) {
        this.registroHoras = registroHoras;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }
}
