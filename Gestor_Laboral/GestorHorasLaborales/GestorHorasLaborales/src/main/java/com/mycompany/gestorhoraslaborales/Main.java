/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorhoraslaborales;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        RegistroHoras registro = new RegistroHoras();

        registro.setCantidadHoras(9);
        registro.setHoraEntrada(
            LocalDateTime.of(2026, 9, 20, 8, 0)
        );
        registro.setHoraSalida(
            LocalDateTime.of(2026, 9, 20, 17, 0)
        );

        ValidadorLegal validador = new ValidadorLegal();

        System.out.println(
            "Supera el limite: "
            + validador.superaLimiteHoras(registro)
        );

        System.out.println(
            "Turno valido: "
            + validador.esTurnoValido(registro)
        );

    }
}
