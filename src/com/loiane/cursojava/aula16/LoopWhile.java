package com.loiane.cursojava.aula16;

import java.util.Scanner;

public class LoopWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 1;
        int max = 10;

        System.out.println("Contando até :"+ max);

        while(i< max)
        {
            System.out.println("Valor de i :"+ i);
        }

        System.out.println(i);


        do{
            i++;
            System.out.println("Valor de "+ i);
        }while(i < 15);


        /*
        Enquanto ->  Valida e depois Execulta 
        Faça em quanto -> Execulta e depois valida
         */

    }
}
