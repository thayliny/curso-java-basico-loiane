package com.loiane.cursojava.aula13;

public class OperadoresLogicos {
    public static void main(String[] args) {

        /*
        *  Operadores Logicos
        *  & -> and
        *  | -> or
        *  ^ -> xor
        * || -> or curto circuito
        * && -> and curto circuito
        *  ! -> not
        *
      */

        // Conceito de Tabela Verdade, Logica matemática

        int valor1 = 1;
        int valor2 = 2;


        boolean resultado1 = (valor1 ==1) &&(valor2==2);
        System.out.println("Valor1 é 1 AND Valor2 é 2 - resultado  "+ resultado1 );

        boolean resultado2 = (valor1 ==1) || (valor2==2);
        System.out.println("Valor1 é 1 OR Valor2 é 2 - resultado  "+ resultado2 );

        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);

    }
}
