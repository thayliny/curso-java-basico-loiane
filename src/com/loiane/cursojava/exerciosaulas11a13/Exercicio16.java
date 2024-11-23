package com.loiane.cursojava.exerciosaulas11a13;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        double metrosQuadrados;
        double valorTintas = 80.0;
        double quantidadeLatas;
        double quantidadeLitros;


        Scanner leitura = new Scanner(System.in);

        metrosQuadrados = leitura.nextDouble();

        quantidadeLitros = (metrosQuadrados/3);

        if (quantidadeLitros > 18)
        {
            quantidadeLatas = (quantidadeLitros/18);
            System.out.println(" A quantidade de Tintas será :  "+ quantidadeLatas);

            valorTintas = quantidadeLatas * valorTintas;
            System.out.println(" O valor será  "+ valorTintas);
        }
        else{

            System.out.println(" A quantidade de Tintas será 1 ");
            System.out.println(" O valor será "+ valorTintas);

        }


    }
}
