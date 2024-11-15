package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDados {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Ler uma linha inteira
        /*System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é  " + nomeCompleto );

        //Ler tipo de dado especifico
        System.out.println("Digite seu primeiro nome :");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é  " + primeiroNome);

       //Ler um Inteiro
       System.out.println("Digite a sua idade");
       int idade = scan.nextInt();
       System.out.println("Sua idade é "+ idade); */

        System.out.println("Digite o seu primeiro nome, idade, quantidade de  filhos, altura e se tem bichinho de estimação : ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.hasNextBoolean();

        System.out.println(" Você Digitou seu primeiro nome:  " + primeiroNome);
        System.out.println("Você Digitou sua idade:  "+ idade);
        System.out.println("Você Digitou quantidade de  filhos:  "+ qtdFilhos);
        System.out.println("Você Digitou  altura:  " + altura );
        System.out.println("Você Digitou  se tem bichinho de estimação:  " + temPet);

    }
}
