package com.loiane.cursojava.exerciosaulas11a13;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double lado;
        lado = leitura.nextDouble();

        double areaQuadrado = Math.pow(lado, 2);
        //double areaQuadrado = lado *lado;


        System.out.printf("Area do Quadrado %.2f",areaQuadrado*2);

    }
}
