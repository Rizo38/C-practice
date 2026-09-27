/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorhoraslaborales;

public class RegistroTrabajador {

    private String idTrabajador;
    private String nombre;
    private String fechaIngreso; // cambiar a localDateTime mas adelante
    private String fechaSalida; // igual cambiar a localDateTime mas adelante
    private String cedula;
    private boolean activo;
    private int diasVacacionesDisponibles;
    private int diasVacacionesTomados;
    private int horasDescanso;
    private int descansoMinimo;
    private int sanciones;
    // la tarifa no va en esta clase, va en otra clase que se encargue de la parte economica del trabajador

    public RegistroTrabajador() {
    }

    public RegistroTrabajador(String idTrabajador, String nombre, String fechaIngreso,
            String fechaSalida, String cedula, boolean activo, int diasVacacionesDisponibles, int diasVacacionesTomados, int horasDescanso, int descansoMinimo, int sanciones) {
        this.idTrabajador = idTrabajador;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.cedula = cedula;
        this.activo = activo;
        this.diasVacacionesDisponibles = diasVacacionesDisponibles;
        this.diasVacacionesTomados = diasVacacionesTomados;
        this.horasDescanso = horasDescanso;
        this.descansoMinimo = descansoMinimo;
        this.sanciones = sanciones;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(String idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegistroTrabajador other = (RegistroTrabajador) obj;
        return idTrabajador.equals(other.idTrabajador);
    }

    @Override
    public int hashCode() {
        return idTrabajador.hashCode();
    }

    /**
     * Devuelve una representación en cadena del objeto RegistroTrabajador.
     *
     * @return una cadena con la información del trabajador
     */
    // metodos generales
    @Override 
    public String toString() {
        return "RegistroTrabajador{" +
                "idTrabajador='" + idTrabajador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }

    public int getDiasVacacionesDisponibles() {
        return diasVacacionesDisponibles;
    }

    public void setDiasVacacionesDisponibles(int diasVacacionesDisponibles) {
        this.diasVacacionesDisponibles = diasVacacionesDisponibles;
    }

    public int getDiasVacacionesTomados() {
        return diasVacacionesTomados;
    }

    public void setDiasVacacionesTomados(int diasVacacionesTomados) {
        this.diasVacacionesTomados = diasVacacionesTomados;
    }

    public int getSanciones() {
        return sanciones;
    }

    public void setSanciones(int sanciones) {
        this.sanciones = sanciones;
    }
    
    /** Documentacion de excpcion que puede lanzar el metodo cumpleDescansoMinimo
     * Busca un trabajador por su id
     * @param id identificarcion del trabajador
     * @return nos devuelve el trabajador si lo encuentra, sino devuelve null
     * @throws IllegalArgumentException si el id es nulo o vacio 
     */
    public RegistroTrabajador buscarPorId(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("El id no puede ser nulo o vacio");
        }
            if (idTrabajador.equals(id)) {
                return this;
            }
        return null;
    }

    public int getHorasDescanso() {
        return horasDescanso;
    }

    public void setHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    public int getDescansoMinimo() {
        return descansoMinimo;
    }

    public void setDescansoMinimo(int descansoMinimo) {
        this.descansoMinimo = descansoMinimo;
    }
} // class


