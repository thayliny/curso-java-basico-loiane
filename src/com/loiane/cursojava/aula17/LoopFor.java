package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class LoopFor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //int i;
        int max = 10;

        for(int i=0; i < 5; i++)
        {
            System.out.println("i tem valor:"+i);
        }


        //decremento
        for(int i=5; i > 0; i--)
        {
            System.out.println("i tem valor:"+i);
        }

        //escopo da variavel, quando declada dentro de um Loop, vai funcionar só lá

        //For com mais de uma varíavel -> se usa ; p/ separação

        /*for( int i=0, j=10; i<j; i++, j--)
        {

        }*/

        //Partes ausentes

        int count =0;
        for(;count <5;)
        {
            System.out.println("valor de count:"+ count);
            count+=2;
        }


        /*Loop Infinito

     for(; ; ;)
     {
     }
         */







    }
}
