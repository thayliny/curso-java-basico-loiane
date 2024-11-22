package com.loiane.cursojava.exerciosaulas11a13;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //Salario por  hora trabalhada

        Scanner leiura = new Scanner(System.in);

        double valorHora;
        valorHora = leiura.nextDouble();

        double horasTrabalhada;
        horasTrabalhada = leiura.nextDouble();

        System.out.println("O valor a receber é R$  "+horasTrabalhada*valorHora);


    }
}
