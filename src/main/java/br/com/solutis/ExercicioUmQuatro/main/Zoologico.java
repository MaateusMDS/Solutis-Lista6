//Crie uma classe Zoologico, com 10 jaulas (utilize um array)
//        coloque em cada jaula um animal diferente, percorra cada jaula e
//        emita o som e, se o tipo de animal possuir o comportamento,
//        faça-o correr.

package br.com.solutis.ExercicioUmQuatro.main;

import br.com.solutis.ExercicioUmQuatro.model.Animal;
import br.com.solutis.ExercicioUmQuatro.model.Cachorro;
import br.com.solutis.ExercicioUmQuatro.model.Cavalo;
import br.com.solutis.ExercicioUmQuatro.model.Preguica;

public class Zoologico {

    public static void main(String[] args) {
        Animal[] jaulas = new Animal[10];
        jaulas[0] = new Cachorro("Bolt, o super cão", 5);
        jaulas[1] = new Cavalo("Pé de pano", 7);
        jaulas[2] = new Cachorro("Rex", 2);
        jaulas[3] = new Animal("Martin", 3);
        jaulas[4] = new Cavalo("Apolo", 4);
        jaulas[5] = new Preguica("Marry", 3);
        jaulas[6] = new Animal("Cristal", 5);
        jaulas[7] = new Animal("Luna", 6);
        jaulas[8] = new Animal("Icaru", 6);
        jaulas[9] = new Animal("Branca", 6);

        for (Animal animal : jaulas) {
            if (animal != null) {
                System.out.println(animal.emitirSom());
                if (animal instanceof Cachorro) {
                    System.out.println(((Cachorro) animal).correr());
                }
                else if (animal instanceof Cavalo) {
                    System.out.println(((Cavalo) animal).correr());
                }
                System.out.println();
            }
        }
    }
}
