package com.loiane.cursojava.exercicioaulas14a15;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        int maiorNumero = 0;
        int menorNumero = 0;

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if ( num1 > num2 && num1 > num3)
        {
            maiorNumero = num1;
        }
        if ( num2 > num1 && num2 > num3)
        {
            maiorNumero = num2;
        }
        if ( num3 > num1 && num3 > num2)
        {
            maiorNumero = num3;
        }


        System.out.println(maiorNumero);

        if ( num1 < num2 && num1 < num3)
        {
            menorNumero = num1;
        }
        if ( num2 < num1 && num2 < num3)
        {
            menorNumero = num2;
        }
        if ( num3 < num1 && num3 < num2)
        {
            menorNumero = num3;
        }

        System.out.println(menorNumero);
    }
}
