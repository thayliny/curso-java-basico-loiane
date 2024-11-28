package com.loiane.cursojava.exercicioaulas14a15;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double produto1, produto2, produto3;

        produto1 = scan.nextDouble();
        produto2 = scan.nextDouble();
        produto3 = scan.nextDouble();

        double maiorValor= 0;
        double menorValor= 0;


        if(produto1 > produto2 && produto1 > produto3){
            maiorValor = produto1;
        }
        if (produto2 > produto1 && produto2 > produto3)
        {
            maiorValor = produto2;
        }
        if (produto3 > produto1 && produto3 > produto2)
        {
            maiorValor = produto3;
        }


        if(produto1 < produto2 && produto1 < produto3){
            menorValor = produto1;
        }
        if (produto2 < produto1 && produto2 < produto3)
        {
            menorValor = produto2;
        }
        if (produto3 < produto1 && produto3 < produto2)
        {
            menorValor = produto3;
        }

        System.out.println(maiorValor);
        System.out.println(menorValor);

    }
}
