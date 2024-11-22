package com.loiane.cursojava.exerciosaulas11a13;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {


        // Area do raio de um circulo

        Scanner leitura = new Scanner(System.in);

        double raio = leitura.nextDouble();

        double areaRaio = 3.14 * Math.pow(raio, 2); // usando a Biblioteca Math
        //double areaRaio = 3.14 * (raio * raio);

        System.out.printf("Area do raio de um circulo %.2f", areaRaio);

    }
}
