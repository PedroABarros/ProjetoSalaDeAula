package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaTest {


    @Test
    void deveRetornarSalarioAdminEnsinoMedio() {
        Pessoa admin = new Administrativo("Jean", Escolaridade.ENSINO_MEDIO);
        assertEquals(1000.0, admin.calcularSalario(), "Salário do Administrativo deve ser 1000.0");
    }
    @Test
    void deveRetornarSalarioAdminGraduacao() {
        Pessoa admin = new Administrativo("João", Escolaridade.GRADUACAO);
        assertEquals(1000.0, admin.calcularSalario(), "Salário do Administrativo deve ser 1000.0");
    }

    @Test
    void deveRetornarSalarioAdminMestrado() {
        Pessoa admin = new Administrativo("João", Escolaridade.MESTRADO);
        assertEquals(1000.0, admin.calcularSalario(), "Salário do Administrativo deve ser 1000.0");
    }

    @Test
    void deveRetornarSalarioAdminDoutorado() {
        Pessoa admin = new Administrativo("João", Escolaridade.DOUTORADO);
        assertEquals(1000.0, admin.calcularSalario(), "Salário do Administrativo deve ser 1000.0");
    }

    @Test
    void deveRetornarSalarioCoordenadorComEnsinoMedio() {
        Pessoa coordenador = new Coordenador("Maria", Escolaridade.ENSINO_MEDIO);
        assertEquals(1000.0, coordenador.calcularSalario(), "Salário do Coordenador com Graduação deve ser 1000.0");
    }

    @Test
    void deveRetornarSalarioCoordenadorComGraduacao() {
        Pessoa coordenador = new Coordenador("Maria", Escolaridade.GRADUACAO);
        assertEquals(1100.0, coordenador.calcularSalario(), "Salário do Coordenador com Graduação deve ser 1100.0");
    }

    @Test
    void deveRetornarSalarioCoordenadorComMestrado() {
        Pessoa coordenador = new Coordenador("Maria", Escolaridade.MESTRADO);
        assertEquals(1200.0, coordenador.calcularSalario(), "Salário do Coordenador com Graduação deve ser 1200.0");
    }

    @Test
    void deveRetornarSalarioCoordenadorComDoutorado() {
        Pessoa coordenador = new Coordenador("Maria", Escolaridade.DOUTORADO);
        assertEquals(1300.0, coordenador.calcularSalario(), "Salário do Coordenador com Graduação deve ser 1300.0");
    }

    @Test
    void deveRetornarSalarioProfessorComEnsinoMedio() {
        Pessoa professor = new Professor("Carlos", Escolaridade.ENSINO_MEDIO, 10);
        assertEquals(10000.0, professor.calcularSalario(), "Salário do Professor com Doutorado e 10 aulas deve ser 10000.0");
    }

    @Test
    void deveRetornarSalarioProfessorComGraduacao() {
        Pessoa professor = new Professor("Carlos", Escolaridade.GRADUACAO, 10);
        assertEquals(11000.0, professor.calcularSalario(), "Salário do Professor com Doutorado e 10 aulas deve ser 11000.0");
    }

    @Test
    void deveRetornarSalarioProfessorComMestrado() {
        Pessoa professor = new Professor("Carlos", Escolaridade.MESTRADO, 10);
        assertEquals(12000.0, professor.calcularSalario(), "Salário do Professor com Doutorado e 10 aulas deve ser 12000.0");
    }

    @Test
    void deveRetornarSalarioProfessorComDoutorado() {
        Pessoa professor = new Professor("Carlos", Escolaridade.DOUTORADO, 10);
        assertEquals(13000.0, professor.calcularSalario(), "Salário do Professor com Doutorado e 10 aulas deve ser 13000.0");
    }
}