package com.mycompany.rpgmanager;
import java.util.Scanner; 

/**
 *
 * @author Estudiante
 */
public class PersonajeBase { 

    String nombre = "Aragorn";
    int nivel = 1;
    double vida = 100.0;
    double vidaMaxima = 100.0;
    boolean estaVivo = true;
    String clase = "Guerrero";
    int puntosAtaque = 15;
    int puntosDefensa = 10;
    int mana = 0; 
    
    public static void main(String[] args){
        
        int ataque = 15;
        double dano = (double) ataque * 1.5; //cast
        String msg = "Dano: " + dano; //auto

        // Leer del usuario (Scanner)
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nom = sc.nextLine();
        System.out.print("Nivel: ");
        int niv = sc.nextInt();
        System.out.println(nom + " Nv." + niv);

        PersonajeBase p = new PersonajeBase();
        
        p.nombre = "Gandalf";
        p.clase = "Mago";
        p.nivel = 5;
        p.vida = 80.0;
        p.mana = 120;  
        System.out.println(p.nombre + " [" + p.clase + "] Nv." + p.nivel + " | Vida: " + p.vida + " | Mana: " + p.mana);
    }
}