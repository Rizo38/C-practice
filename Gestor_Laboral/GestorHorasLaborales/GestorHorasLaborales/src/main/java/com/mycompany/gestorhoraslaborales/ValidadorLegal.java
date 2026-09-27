/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorhoraslaborales;

/**
 *
 * @author Antonio
 * 
 * Esta clase se encarga de validar la legalidad del turno realizado
 */
public class ValidadorLegal {

	public boolean cumpleDescansoMinimo(RegistroHoras registro) { // registro es una variable 
	    return registro != null
        && registro.getTrabajador() != null
        && registro.getTrabajador().getHorasDescanso() >= getDescansoMinimo();
	}


    public boolean superaLimiteHoras(RegistroHoras registro) {
        return false; // Implementar la lógica de validación del límite de horas
    }

    public boolean esTurnoValido(RegistroHoras registro) {
        return cumpleDescansoMinimo(registro) 
        && !superaLimiteHoras(registro)
        && permiteHorasExtras(registro);
    }

    public boolean permiteHorasExtras(RegistroHoras registro) {
        if (registro == null) {
            return false;
        }

        return registro.getHorasDiurnas()
                + registro.getHorasMixtas()
                + registro.getHorasNocturnas() <= 8;
    }

    // se consulta a registro trabajador cuantos dias tiene pentientes de vacaciones, si tiene mas de 0 dias entonces tiene vacaciones pendientes, es muy facil
    public boolean vacacionesPendientes (RegistroTrabajador trabajador) { // trabajador es el objeto que contiene la informacion del trabajador
        return trabajador.getDiasVacacionesDisponibles() > 0;
    }


    public int getDescansoMinimo() {
        return 8; // Descanso minimo de 8 horas
    }

    // para tener el objeto en esta clase y poder acceder a sus metodos se pasa como parametro el objeto trabajador
    public boolean DescansoMinimo(RegistroTrabajador trabajador) {
        return trabajador.getHorasDescanso() >= getDescansoMinimo();
    }


    // trabajador es la variable que recibe el objeto trabajador, y se consulta a ese objeto cuantas sanciones tiene, si tiene mas de 0 entonces tiene sanciones pendientes
    public void registrarSanciones (RegistroTrabajador trabajador) {
        if (trabajador != null) {
            if (DescansoMinimo(trabajador)) {
                // No se registra sanción, el trabajador ha cumplido con el descanso mínimo
            } else {
                // Se registra una sanción, el trabajador no ha cumplido con el descanso mínimo
                int sancionesActuales = trabajador.getSanciones();
                trabajador.setSanciones(sancionesActuales + 1); // el trabajador aumenta a razon de 1 la sancion, lo que es equivalente a una sancion para la empresa
                }
            }
    }


} // class
