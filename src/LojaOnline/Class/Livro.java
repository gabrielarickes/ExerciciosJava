package LojaOnline.Class;

public class Livro extends Produto{

    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    protected int frete = 10;

    @Override
    public int frete() {
        return frete;
    }

    @Override
    public double calcularFrete() {
        return getPreco() + frete;
    }
}
