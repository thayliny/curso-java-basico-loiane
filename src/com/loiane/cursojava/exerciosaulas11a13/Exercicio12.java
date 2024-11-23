package com.loiane.cursojava.exerciosaulas11a13;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        //Peso Ideal
        Scanner leitura = new Scanner(System.in);

        double altura, peso;
        //double peso;

        altura = leitura.nextDouble();

        peso = (75.7*altura)-58;

        System.out.println("Peso ideal "+ peso);

    }
}
