package com.loiane.cursojava.exerciosaulas11a13;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        //Temperatura em Graus Farenheit para Celcius
        Scanner leitura = new Scanner(System.in);

        double fahrenheit;
        fahrenheit = leitura.nextDouble();

        double celcius;

        celcius = (5*(fahrenheit-32)/9);

        System.out.printf("Cº %.2f",celcius);


    }
}
