package org.example;

public class Coordenador extends Pessoa {
    private static final double SALARIO_BASE = 1000.0;

    public Coordenador(String nome, Escolaridade escolaridade) {
        super(nome, escolaridade);
    }

    @Override
    public double calcularSalario() {
        double percentual = calcularPercentualEscolaridade();
        return SALARIO_BASE * (1 + percentual);
    }
}