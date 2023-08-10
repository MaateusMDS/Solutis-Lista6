package br.com.solutis.ExercicioOitoOnze.model;

public class FuncionarioMedio extends Funcionario {

    private String nomeEscola;
    private final TipoEscolaridade tipoEscolaridade;

    public FuncionarioMedio(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        this.tipoEscolaridade = TipoEscolaridade.ENSINO_MEDIO;
    }

    public FuncionarioMedio(String nome, int codigoFuncional, String nomeEscola, Cargo cargo) {
        super(nome, codigoFuncional, cargo);
        this.nomeEscola = nomeEscola;
        this.tipoEscolaridade = TipoEscolaridade.ENSINO_MEDIO;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public FuncionarioMedio setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        return this;
    }

    @Override
    public double calcularRendaTotal(){
        return super.calcularRendaTotal() * 1.6;
    }

}
