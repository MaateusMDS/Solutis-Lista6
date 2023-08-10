package br.com.solutis.ExercicioCincoSete.model;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double rendaBasica;

    public Funcionario() {
    }

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
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

    public double calcularRendaTotal(){
        return this.rendaBasica;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nCódigo Funcional: " + this.codigoFuncional + "\nRenda Total: " + this.calcularRendaTotal();
    }
}
