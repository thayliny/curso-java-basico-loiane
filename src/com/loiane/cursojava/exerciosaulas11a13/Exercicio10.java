package com.loiane.cursojava.exerciosaulas11a13;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        //Temperatura  de Celcius para fahrenheit

        Scanner leitura = new Scanner(System.in);

        double C;
        C = leitura.nextDouble();

        double F;

        F =(C*(1.8))+32;

        System.out.printf("Fº %.2f ", F);

    }
}
