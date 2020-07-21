package com.teste;

import com.Classes.Professor;

public class TesteProfessor {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Karol";
        professor.matricula = 123;
        professor.rg = "123.456-01";
        professor.cpf = "123.456.789-10";

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
    }
}
