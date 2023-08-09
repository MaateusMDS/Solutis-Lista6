package br.com.solutis.ExercicioUmQuatro.model;

public class Cavalo extends Animal {

    public Cavalo() {
    }

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return this.getNome() + " fez hihihi!";
    }

    public String correr(){
        return this.getNome() + " correu!";
    }

}
