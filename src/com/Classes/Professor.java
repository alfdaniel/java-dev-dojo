package com.Classes;

public class Professor {
    private String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

}
