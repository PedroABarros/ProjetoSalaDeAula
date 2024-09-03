package org.example;

public abstract class Pessoa {
    protected String nome;
    protected Escolaridade escolaridade;

    public Pessoa(String nome, Escolaridade escolaridade) {
        this.nome = nome;
        this.escolaridade = escolaridade;
    }

    public abstract double calcularSalario();

    protected double calcularPercentualEscolaridade() {
        switch (escolaridade) {
            case GRADUACAO:
                return 0.10;
            case MESTRADO:
                return 0.20;
            case DOUTORADO:
                return 0.30;
            default:
                return 0.00;
        }
    }
}