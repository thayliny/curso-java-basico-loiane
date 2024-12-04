package com.loiane.cursojava.exerciciosaulas16a17;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        /*Altere o programa anterior permitindo ao usuário informar as
        populações e as taxas de crescimento iniciais. Valide a entrada e
        permita repetir a operação*/

        Scanner scan = new Scanner(System.in);
        int i=0;

        double populacaoUm;
        double populacaoDois;

        double porcentagemUm;
        double porcentagemDois;

        System.out.println("Informe Populacao e taxa de crescimneto :");
        populacaoUm = scan.nextDouble();
        porcentagemUm = scan.nextDouble();

        System.out.println("Informe Populacao e taxa de crescimneto :");
        populacaoDois = scan.nextDouble();
        porcentagemDois = scan.nextDouble();



       /*do{
            double cont = ((porcentagemUm/ 100) * populacaoUm);
            System.out.println(cont);
            populacaoUm = cont + populacaoUm;
            i++;

            double contDois = ((porcentagemDois/ 100) * populacaoDois);
            //System.out.println(contDois);
            //populacaoDois = cont + populacaoDois;


        }while(populacaoUm <= populacaoDois);

        System.out.println("População Um" + populacaoUm);
        System.out.println("População Dois" + populacaoDois);
        System.out.println("Anos" + i);

        scan.close();*/

        while (populacaoUm <= populacaoDois) {
            populacaoUm += populacaoUm * porcentagemUm;
            populacaoDois+= populacaoDois * porcentagemDois;
            i++;

        }

        System.out.println("Serão necessários " + i + " anos para que a população do país A ultrapasse ou iguale a população do país B.");



    }






}
