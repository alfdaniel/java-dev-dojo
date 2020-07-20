package com.teste;

import com.Classes.Carro;

public class TestesCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.placa = "Kle 5483";
        carro.velocidadeMaxima = 120f;

        System.out.println(carro.marca);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
        

    }
}
