package br.com.solutis.ExercicioOitoOnze.model;

public class FuncionarioBasico extends Funcionario {

    private String nomeEscola;
    private final TipoEscolaridade tipoEscolaridade;

    public FuncionarioBasico(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        this.tipoEscolaridade = TipoEscolaridade.ENSINO_BASICO;
    }
    public FuncionarioBasico(String nome, int codigoFuncional, String nomeEscola, Cargo cargo) {
        super(nome, codigoFuncional, cargo);
        this.nomeEscola = nomeEscola;
        this.tipoEscolaridade = TipoEscolaridade.ENSINO_BASICO;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public FuncionarioBasico setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        return this;
    }

    @Override
    public double calcularRendaTotal(){
        return super.calcularRendaTotal() * 1.1;
    }
}
