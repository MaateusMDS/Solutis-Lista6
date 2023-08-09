package br.com.solutis.ExercicioUmQuatro.model;

public class Animal {

    private String nome;
    private int idade;

    public Animal() {
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Animal setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Animal setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public String emitirSom(){
        return this.nome + " emitiu um som!";
    }
}
