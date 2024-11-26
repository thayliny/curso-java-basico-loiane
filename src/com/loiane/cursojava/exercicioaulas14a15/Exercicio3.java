package com.loiane.cursojava.exercicioaulas14a15;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char sexo;

        sexo= scan.next().charAt(0);

        switch(sexo)
        {
            case 'F':
                System.out.println("Feminio"); break;
            case 'M':
                System.out.println("Masculino"); break;
            default:
                System.out.println("Sexo Invalido");
        }

    }
}
