package com.mycompany.rpgmanager;

public class LogicaCombate {
    public static void main(String[] args) {
        double vidaEnemigo = 40.0;
        int ataque = 35;
        int nivelJugador = 6;
        int bonificacion;

        if (nivelJugador >= 5) {
            bonificacion = 10;
        } else {
            bonificacion = 0;
        }

 
        int danoTotal = ataque + bonificacion;
        double vidaRestante = vidaEnemigo - danoTotal;

        if (vidaRestante <= 0) {
            System.out.println("Enemigo derrotado! +50 XP");
        } else if (vidaRestante <= 20) {
            System.out.println("Enemigo en estado critico");
        } else {
            System.out.println("Enemigo resiste. Vida restante: " + vidaRestante);
        }
    }
}
