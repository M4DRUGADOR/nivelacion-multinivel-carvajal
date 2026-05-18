/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udistrital.multinivel.nivelacion.multinivel.carvajal;

/**
 *
 * @author Usuario
 */
public class SistemaExperiencia {
    // Java: acumular XP hasta subir nivel
    public static void main(String[] args){
    int xp = 0;
    int nivel = 1;
    int xpNecesario = 100;
    int[] batallas = {20,35,15,40,30};
    for (int xpGanado : batallas ) {
        xp += xpGanado;
        if (xp >= xpNecesario) {
        nivel++;
        xp -= xpNecesario;
        System.out.println("Nivel "+nivel);
        }
    }   
   }
}
