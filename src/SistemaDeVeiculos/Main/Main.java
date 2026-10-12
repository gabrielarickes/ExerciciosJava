package SistemaDeVeiculos.Main;

import SistemaDeVeiculos.Class.Carro;
import SistemaDeVeiculos.Class.Ligavel;
import SistemaDeVeiculos.Class.Moto;

public class Main {
    static void main() {
        Ligavel [] veiculos = new Ligavel[2];

        veiculos[0] = new Carro();
        veiculos[1] = new Moto();

        for(Ligavel veiculo: veiculos){
            veiculo.ligar();
            veiculo.desligar();
        }
    }
}
