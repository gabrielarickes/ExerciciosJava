package SistemaDeCadastroDeProdutos.Class;

import java.util.ArrayList;

public class Estoque  {

     private ArrayList<Produto>produtos = new ArrayList<>();


    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    public void listarProduto(){

        if(produtos.isEmpty()){
            System.out.println("Estoque Vazio!");
        }
        else {
            for (Produto p : produtos) {
                System.out.println("Nome do Produto: " + p.getNome());
                System.out.println("Valor do Produto: " + p.getPreco());
                System.out.println("Quantidade do Produto no Estoque: " + p.getQuantidade());
            }
        }
    }
    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        for(Produto valor: produtos){
             valorTotal += valor.calcularValorTotal();
        }
        return valorTotal;
    }
}
