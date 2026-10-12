package SistemaDeVeiculos.Class;

public class Moto implements Ligavel{
    @Override
    public void ligar() {
        System.out.println("Estou ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Estou desligado");
    }
}
