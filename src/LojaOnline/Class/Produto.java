package LojaOnline.Class;

public class Produto {
    protected String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome do produto: "+nome);
        System.out.println("Preço: "+getPreco());
        System.out.println("Frete: "+frete());
        System.out.println("Preço final: "+calcularFrete());

    }

    public double calcularFrete(){
        return 0;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int frete(){
        return 0;
    }
}
