package org.example;

public class Administrativo extends Pessoa {
    private static final double SALARIO_BASE = 1000.0;

    public Administrativo(String nome, Escolaridade escolaridade) {
        super(nome, escolaridade);
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE;
    }
}