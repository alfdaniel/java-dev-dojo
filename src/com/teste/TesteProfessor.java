package com.teste;

import com.Classes.Professor;

public class TesteProfessor {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.setNome ("Karol");
        professor.matricula = "123";
        professor.rg = "123.456-01";
        professor.cpf = "123.456.789-10";

        System.out.println(professor.getNome());
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);

        Professor professor2 = new Professor();
        professor2.setNome("Daniel");
        professor2.matricula = "1010";
        professor2.rg = "000.000-00";
        professor2.cpf = "111.111.111-11";

        System.out.println(professor2.getNome());
        System.out.println(professor2.matricula);
        System.out.println(professor2.rg);
        System.out.println(professor2.cpf);
    }
}
