package com.loiane.cursojava.exerciciosaulas16a17;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do{
            nome= scan.next();
            if(nome.length() <= 3)
            {
                System.out.println("Nome Inválido! Deve ter mais de 3 Caracteres");
            }


        }while(nome.length()<=3);

        do{

            idade= scan.nextInt();
            if(idade >= 0 && idade >150)
            {
                System.out.println("Idade Inválida! Dever ter entre 0 e 150");
            }

        }while(idade >=0 && idade > 150);


        do{

            salario = scan.nextDouble();
            if(salario < 0)
            {
                System.out.println("Salário Invalido");
            }

        }while(salario < 0);

       do{

           sexo = scan.next().charAt(0);
           if(sexo != 'f' && sexo != 'm')
           {
               System.out.println("Sexo Inválido");
           }

       }while(sexo != 'f' && sexo != 'm');

       do{

           estadoCivil = scan.next().charAt(0);
           if(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd')
           {
               System.out.println("Estado civil incorreto");
           }

       }while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');


        // Exibição dos dados validados
        System.out.println("\nInformações Validadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));
        System.out.println("Estado Civil: " + estadoCivil);

        scan.close();

    }
}
