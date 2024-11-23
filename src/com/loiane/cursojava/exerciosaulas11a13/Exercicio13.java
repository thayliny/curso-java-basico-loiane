package com.loiane.cursojava.exerciosaulas11a13;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {


        //Peso ideal

        char sexo;
        double altura;

        Scanner leitura = new Scanner(System.in);

        sexo = leitura.next().charAt(0);
        altura = leitura.nextDouble();


        if (sexo == 'F') {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Peso ideal de uma mulher :" + pesoIdeal);
        } else if (sexo == 'M') {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Peso ideal de uma Homem :" + pesoIdeal);
        } else {

            System.out.println("Informação de sexo incorreta");
        }

        leitura.close();

    }


}
