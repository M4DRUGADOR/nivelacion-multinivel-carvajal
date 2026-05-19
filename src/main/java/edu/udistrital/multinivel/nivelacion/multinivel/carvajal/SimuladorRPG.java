/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udistrital.multinivel.nivelacion.multinivel.carvajal;

/**
 *
 * @author Usuario
 */
public class SimuladorRPG {

    public static int combatir(int vidaHero, int ataqueHero, int defHero, int vidaEnemigo, int ataqueEnemigo) {
        while (vidaHero > 0 && vidaEnemigo > 0) {
            vidaEnemigo = vidaEnemigo - ataqueHero;
            
            if (vidaEnemigo > 0) {
                int danoEnemigo = ataqueEnemigo - defHero;
                if (danoEnemigo < 1) {
                    danoEnemigo = 1;
                }
                vidaHero = vidaHero - danoEnemigo;
            }
        }
        return vidaHero;
    }

    public static void main(String[] args) {
        // Estadísticas del Héroe
        String heroe = "Guerrero";
        int nivelHeroe = 2;
        int vidaHeroe = 80;
        int maxVidaHeroe = 80; 
        int ataqueHeroe = 18;
        int defensaHeroe = 8;

        String[] nombresEnemigos = {"Goblin", "Orco", "Dragón"};
        int[] vidasEnemigos = {40, 70, 120};
        int[] ataquesEnemigos = {8, 14, 25};

        int enemigosDerrotados = 0;

        System.out.println("=== Inicio ===");

        for (int i = 0; i < nombresEnemigos.length; i++) {
            System.out.println("¡Aparece un " + nombresEnemigos[i] + " (HP: " + vidasEnemigos[i] + ")!");

            vidaHeroe = combatir(vidaHeroe, ataqueHeroe, defensaHeroe, vidasEnemigos[i], ataquesEnemigos[i]);

            if (vidaHeroe <= 0) {
                System.out.println("¡El " + heroe + " ha caído en combate frente al " + nombresEnemigos[i] + "!");
                break; 
            } else {
                System.out.println("¡Has derrotado al " + nombresEnemigos[i] + "!");
                enemigosDerrotados++;
                vidaHeroe = vidaHeroe + 20;
                if (vidaHeroe > maxVidaHeroe) {
                    vidaHeroe = maxVidaHeroe;
                }
                System.out.println("Te recuperas tras la batalla. Vida actual: " + vidaHeroe + "/" + maxVidaHeroe);
            }
        }

        System.out.println("           RESULTADO FINAL               ");
        
        if (enemigosDerrotados == nombresEnemigos.length) {
            System.out.println("Victoria.");
        } else {
            System.out.println("Derrota.");
        }
        System.out.println("Enemigos derrotados: " + enemigosDerrotados + " de " + nombresEnemigos.length);
        System.out.println("Vida restante del héroe: " + (vidaHeroe > 0 ? vidaHeroe : 0));
    }
}
