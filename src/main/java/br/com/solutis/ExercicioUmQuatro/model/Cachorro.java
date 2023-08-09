package br.com.solutis.ExercicioUmQuatro.model;

public class Cachorro extends Animal {


        public Cachorro() {
        }

        public Cachorro(String nome, int idade) {
            super(nome, idade);
        }
        @Override
        public String emitirSom() {
            return this.getNome() + " fez auau!";
        }

        public String correr(){
            return this.getNome() + " correu!";
        }
}
