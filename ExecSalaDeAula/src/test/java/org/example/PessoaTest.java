package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaTest {


    @Test
    void deveRetornarSalarioEnsinoMedio() {
        Pessoa admin = new Administrativo("Jean", Escolaridade.ENSINO_MEDIO);
        assertEquals(1000.0, admin.calcularSalario(), "Salário do Administrativo deve ser 1000.0");
    }
    @Test
    void deveRetornarSalarioAdministrativo() {
        Pessoa admin = new Administrativo("João", Escolaridade.GRADUACAO);
        assertEquals(1000.0, admin.calcularSalario(), "Salário do Administrativo deve ser 1000.0");
    }

    @Test
    void deveRetornarSalarioCoordenadorComGraduacao() {
        Pessoa coordenador = new Coordenador("Maria", Escolaridade.GRADUACAO);
        assertEquals(1100.0, coordenador.calcularSalario(), "Salário do Coordenador com Graduação deve ser 1100.0");
    }

    @Test
    void deveRetornarSalarioProfessorComDoutorado() {
        Pessoa professor = new Professor("Carlos", Escolaridade.DOUTORADO, 6);
        assertEquals(7800.0, professor.calcularSalario(), "Salário do Professor com Doutorado e 10 aulas deve ser 7800.0");
    }
}