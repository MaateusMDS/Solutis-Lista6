package br.com.solutis.ExercicioOitoOnze.main;

import br.com.solutis.ExercicioOitoOnze.model.*;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < 4; i++) {
            funcionarios[i] = new FuncionarioBasico("Funcionario " + i, i, "Escola " + i, Cargo.SUPERVISOR);
        }

        for (int i = 4; i < 8; i++) {
            funcionarios[i] = new FuncionarioMedio("Funcionario " + i, i, "Escola " + i, Cargo.VENDEDOR);
        }

        for (int i = 6; i < 10; i++) {
            funcionarios[i] = new FuncionarioGraduado("Funcionario " + i, i, "Universidade " + (i - 7), Cargo.GERENTE);
        }

        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;

        double custoGerentes = 0;
        double custoSupervisores = 0;
        double custoVendedores = 0;


        for (Funcionario funcionario : funcionarios) {
            custoTotal += funcionario.calcularRendaTotal();

            if (funcionario instanceof FuncionarioBasico) {
                custoEnsinoBasico += funcionario.calcularRendaTotal();
            } else if (funcionario instanceof FuncionarioMedio) {
                custoEnsinoMedio += funcionario.calcularRendaTotal();
            } else if (funcionario instanceof FuncionarioGraduado) {
                custoGraduacao += funcionario.calcularRendaTotal();
            }

            if (funcionario.getCargo() == Cargo.GERENTE) {
                custoGerentes += funcionario.calcularRendaTotal();
            } else if (funcionario.getCargo() == Cargo.SUPERVISOR) {
                custoSupervisores += funcionario.calcularRendaTotal();
            } else if (funcionario.getCargo() == Cargo.VENDEDOR) {
                custoVendedores += funcionario.calcularRendaTotal();
            }
        }

        System.out.println("Custo total da empresa: " + custoTotal);

        var decimalFormat = new DecimalFormat("#.00");

        System.out.println();
        System.out.println("Custo de gerentes: " + decimalFormat.format(custoGerentes));
        System.out.println("Custo de supervisores: " + decimalFormat.format(custoSupervisores));
        System.out.println("Custo de vendedores: " + decimalFormat.format(custoVendedores));

        for (Funcionario funcionario : funcionarios) {
            System.out.println();
            System.out.println(funcionario);
        }
    }
}