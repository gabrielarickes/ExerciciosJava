package SistemaDeVeiculos.Class;

public class Carro implements Ligavel{
    @Override
    public void ligar() {
        System.out.println("Estou ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Estou desligado");
    }
}
