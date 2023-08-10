package br.com.solutis.ExercicioOitoOnze.model;

public class FuncionarioGraduado extends Funcionario {

    private String nomeEscola;
    private final TipoEscolaridade tipoEscolaridade;

    public FuncionarioGraduado(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        this.tipoEscolaridade = TipoEscolaridade.GRADUCAO;
    }

    public FuncionarioGraduado(String nome, int codigoFuncional, String nomeEscola, Cargo cargo) {
        super(nome, codigoFuncional, cargo);
        this.nomeEscola = nomeEscola;
        this.tipoEscolaridade = TipoEscolaridade.GRADUCAO;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public FuncionarioGraduado setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        return this;
    }

    @Override
    public double calcularRendaTotal(){
        return super.calcularRendaTotal() * 2.6;
    }
}
