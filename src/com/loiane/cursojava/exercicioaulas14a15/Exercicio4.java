package com.loiane.cursojava.exercicioaulas14a15;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char letra;

        letra = scan.next().charAt(0);

        if (Character.isUpperCase(letra)){

            System.out.println("Maiuscula");
        }
        else{

            System.out.println("Minuscula");
        }


    }


}
