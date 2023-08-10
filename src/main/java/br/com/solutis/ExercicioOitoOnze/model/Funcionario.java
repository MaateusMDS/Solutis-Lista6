package br.com.solutis.ExercicioOitoOnze.model;

import java.text.DecimalFormat;

public class Funcionario {
    private String nome;
    private Cargo cargo;
    private int codigoFuncional;
    private double rendaBasica;

    public Funcionario() {
    }

    public Funcionario(String nome, int codigoFuncional, Cargo cargo) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.cargo = cargo;
        this.rendaBasica = 1000;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public Funcionario setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
        return this;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Funcionario setCargo(Cargo cargo) {
        this.cargo = cargo;
        return this;
    }

    public double calcularRendaTotal(){

        return switch (this.cargo) {
            case GERENTE -> this.rendaBasica + 1500;
            case SUPERVISOR -> this.rendaBasica + 600;
            case VENDEDOR -> this.rendaBasica + 250;
            default -> this.rendaBasica;
        };

    }

    public String toString() {
        var decimalFormat = new DecimalFormat("#.00");
        return "Nome: " + this.nome + "\nCódigo Funcional: " + this.codigoFuncional + "\nRenda Total: " + decimalFormat.format(this.calcularRendaTotal());
    }
}
