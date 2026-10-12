package SistemaDeCadastroDeProdutos.Main;

import SistemaDeCadastroDeProdutos.Class.Estoque;
import SistemaDeCadastroDeProdutos.Class.Produto;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        Estoque estoque = new Estoque();

        while (true){
            System.out.println("----CADASTRO DE PRODUTOS---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Ver o valor total do estoque");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção:");
            System.out.println();
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Qual o nome do produto? ");
                    String nome = entrada.nextLine();
                    System.out.println("Qual o valor unitário do produto? ");
                    double preco = entrada.nextDouble();
                    System.out.println("Quantas unidades do produto possui? ");
                    int quantidade = entrada.nextInt();

                    if(preco<=0){
                        System.out.println("Valor inválido");
                        continue;
                    } else if (quantidade < 0) {
                        System.out.println("Valor inválido");
                    } else {
                        Produto produto = new Produto(nome, preco, quantidade);
                        estoque.adicionarProduto(produto);
                        System.out.println("Produto adicionado com sucesso!");
                    }
                    break;
                case 2:
                    estoque.listarProduto();
                    break;
                case 3:
                    System.out.println("Valor total no estoque");
                    System.out.println(estoque.calcularValorTotalEstoque());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
