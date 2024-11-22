package com.loiane.cursojava.aula13;

public class CurtoCircuito {

    public static void main(String[] args) {

        // O curto circuito é mais sobre  a execulção do Programa java

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso &
                verdadeiro;
        boolean resultado2 = falso &&
                verdadeiro;

        System.out.println(resultado1);
        System.out.println(resultado2);


        //precendência NO Java

        int resultado =  1+1-1+1*1/1;
        System.out.println(resultado);

    }
}
