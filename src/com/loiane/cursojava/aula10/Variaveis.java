package com.loiane.cursojava.aula10;

public class Variaveis{

    public static  void main(String[] args)
    {
        //Convenção Java
        int  idade = 24;
        String nome = "Thayliny";
        String nomeDoMeuCachorro = "Marti";
        String ano2024 = "2024";

        //Aceito, mas não utilizado
        int _idade;
        int $idade;

        //não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;


        /* Declaração de Variveis
        nome de variavel no Java começa com minuscula e segue o CamelCase, CaseSensitive */

        idade = 25;

        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);
        System.out.println("Nome Pet = " + nomeDoMeuCachorro);

        //Boas práticas -> nomesDeVariaveis-> nomes que signifiquem algo

    }
}
