package br.com.solutis.ExercicioUmQuatro.main;

import br.com.solutis.ExercicioUmQuatro.model.Preguica;
import br.com.solutis.ExercicioUmQuatro.model.Veterinario;
import br.com.solutis.ExercicioUmQuatro.model.Cachorro;
import br.com.solutis.ExercicioUmQuatro.model.Cavalo;

public class ExercicioTres {
    public static void main(String[] args) {

        var veterinario = new Veterinario();

        var cachorro = new Cachorro("Rex", 2);
        var cavalo = new Cavalo("Pé de Pano", 5);
        var preguica = new Preguica("Marry", 3);

        System.out.println(veterinario.examinar(cachorro));
        System.out.println(veterinario.examinar(cavalo));
        System.out.println(veterinario.examinar(preguica));
    }
}
