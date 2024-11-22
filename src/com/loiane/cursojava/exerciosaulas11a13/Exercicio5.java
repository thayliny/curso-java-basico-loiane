package com.loiane.cursojava.exerciosaulas11a13;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // converter metro em centimetro

        double metro;
        metro = leitura.nextDouble();

        System.out.printf("O metro  %.1f em centimentos é %.1f%n ",metro,(metro * 100));
        //Quando usamos o printf não usamos concatenação, segue o padrão C
    }
}
