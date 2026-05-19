/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udistrital.multinivel.nivelacion.multinivel.carvajal;

/**
 *
 * @author Usuario
 */
public class FuncionesRPG  {
    public static int subirNivel (int xpActual, int xpNecesario, int nivelActual){
 
    if (xpActual>=xpNecesario){
        nivelActual=nivelActual+1;
        xpActual=0;
        System.out.println("Alcanzaste el nivel: " + nivelActual);
    }
    return nivelActual;
    }
    public static void main(String[]args){
    int xpActual=110;
    int xpNecesario=100;
    int nivelActual=3;
    int resultadoNivel = subirNivel(xpActual, xpNecesario, nivelActual);
        System.out.println("Nivel final del personaje: " + resultadoNivel);  
    }
}
