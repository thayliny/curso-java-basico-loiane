package com.loiane.cursojava.exerciosaulas11a13;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

    double valorHora, horasTrabalhadas, inss, sindicato,impostoDeRenda, salarioLiquido, salarioBruto;

        Scanner leitura = new Scanner(System.in);

        valorHora = leitura.nextDouble();
        horasTrabalhadas = leitura.nextDouble();

        salarioBruto = valorHora * horasTrabalhadas;
        inss = (8 * salarioBruto)/100;
        sindicato = (5 * salarioBruto)/100;
        impostoDeRenda = (11*salarioBruto)/100;
        salarioLiquido = salarioBruto - (inss+sindicato+impostoDeRenda);



        System.out.println("Salário Bruto   "+salarioBruto);
        System.out.println("INSS  " +inss);
        System.out.println("Sindicato  "+sindicato);
        System.out.println("Imposto de Renda  "+impostoDeRenda);
        System.out.println("Salário Liquido  "+salarioLiquido);





















    }






}
