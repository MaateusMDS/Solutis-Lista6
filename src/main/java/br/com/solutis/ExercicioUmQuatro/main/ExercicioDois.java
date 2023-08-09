package br.com.solutis.ExercicioUmQuatro.main;

import br.com.solutis.ExercicioUmQuatro.model.Cachorro;
import br.com.solutis.ExercicioUmQuatro.model.Cavalo;
import br.com.solutis.ExercicioUmQuatro.model.Preguica;

public class ExercicioDois {
    public static void main(String[] args) {

        var cavalo = new Cavalo("Pé de pano", 7);
        System.out.println(cavalo.emitirSom());

        var cachorro = new Cachorro("Bolt, o super cão", 5);
        System.out.println(cachorro.emitirSom());

        var preguica = new Preguica("Marry", 3);
        System.out.println(preguica.emitirSom());
    }
}
