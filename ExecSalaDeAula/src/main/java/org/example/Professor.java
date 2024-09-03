package org.example;

public class Professor extends Pessoa {
    private int quantidadeAulas;
    private static final double SALARIO_BASE = 1000.0;

    public Professor(String nome, Escolaridade escolaridade, int quantidadeAulas) {
        super(nome, escolaridade);
        this.quantidadeAulas = quantidadeAulas;
    }

    @Override
    public double calcularSalario() {
        double percentual = calcularPercentualEscolaridade();
        return SALARIO_BASE * quantidadeAulas * (1 + percentual);
    }
}