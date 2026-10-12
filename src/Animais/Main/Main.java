package Animais.Main;

import Animais.Class.Animal;
import Animais.Class.Cachorro;
import Animais.Class.Gato;
import Animais.Class.Vaca;

public class Main {
    static void main() {
        Animal [] animais = new Animal[3];
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Vaca();

        for(Animal animal:animais){
            animal.emitirSom();
        }
    }
}
