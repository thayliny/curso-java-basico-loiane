package com.loiane.cursojava.exerciciosaulas16a17;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        String senha;

        nome = scan.next();
        senha = scan.next();

        do{
            System.out.println("A senha não pode ser igual ao nome, redefina :");
            senha = scan.next();


        }while(senha==nome);
    }
}
