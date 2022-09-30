package main;

import personagens.*;

public class Main {

    public static void main(String[] args) {
        Mago m = new Mago(80f, 20f, 50f, "Caio", 100f, 15);
        System.out.println(m);

        Guerreiro g = new Guerreiro(40f, 60f, "Pedro", 90f, 20);
        System.out.println(g);

        Arqueiro a = new Arqueiro(50f, 40f, "João", 80f, 30);
        System.out.println(a);

        System.out.println("Guerreiro e Arqueiro irão se enfrentar!");
        while(g.getVida() > 0 && a.getVida() > 0){
           System.out.print(a.ataque(""));
           System.out.print(a.ataque("50"));
           System.out.println("Guerreiro perdeu vida");
           g.sofrerAtaque(30);
        }

    }

}
