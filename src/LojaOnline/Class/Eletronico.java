package LojaOnline.Class;

public class Eletronico extends Produto{
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    protected int frete = 25;

    @Override
    public int frete() {
        return frete;
    }

    @Override
    public double calcularFrete() {
        return getPreco() + frete;
    }
}
