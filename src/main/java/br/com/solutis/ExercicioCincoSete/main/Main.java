package br.com.solutis.ExercicioCincoSete.main;

import br.com.solutis.ExercicioCincoSete.model.Funcionario;
import br.com.solutis.ExercicioCincoSete.model.FuncionarioBasico;
import br.com.solutis.ExercicioCincoSete.model.FuncionarioGraduado;
import br.com.solutis.ExercicioCincoSete.model.FuncionarioMedio;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < 4; i++) {
            funcionarios[i] = new FuncionarioBasico("Funcionario " + i, i, "Escola " + i);
        }

        for (int i = 4; i < 8; i++) {
            funcionarios[i] = new FuncionarioMedio("Funcionario " + i, i, "Escola " + i);
        }

        for (int i = 8; i < 10; i++) {
            funcionarios[i] = new FuncionarioGraduado("Funcionario " + i, i, "Universidade " + (i - 7));
        }

        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;

        for (Funcionario funcionario : funcionarios) {
            custoTotal += funcionario.calcularRendaTotal();

            if (funcionario instanceof FuncionarioBasico) {
                custoEnsinoBasico += funcionario.calcularRendaTotal();
            } else if (funcionario instanceof FuncionarioMedio) {
                custoEnsinoMedio += funcionario.calcularRendaTotal();
            } else if (funcionario instanceof FuncionarioGraduado) {
                custoGraduacao += funcionario.calcularRendaTotal();
            }
        }

        System.out.println("Custo total da empresa: " + custoTotal);
        System.out.println("Custo de funcionários com Ensino Básico: " + custoEnsinoBasico);
        System.out.println("Custo de funcionários com Ensino Médio: " + custoEnsinoMedio);
        System.out.println("Custo de funcionários com Graduação: " + custoGraduacao);
    }
}