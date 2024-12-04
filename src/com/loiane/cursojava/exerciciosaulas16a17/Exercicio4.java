package com.loiane.cursojava.exerciciosaulas16a17;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = 0;

        double populacaoUm = 80000;
        double populacaoDois = 200000;

        do {
            double cont = ((0.3/ 100) * populacaoUm);
            System.out.println(cont);
            populacaoUm = cont + populacaoUm;
            i++;

        } while (populacaoUm <= populacaoDois);

        System.out.println(i);
    }

}
