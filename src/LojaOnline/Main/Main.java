package LojaOnline.Main;

import LojaOnline.Class.Eletronico;
import LojaOnline.Class.Livro;
import LojaOnline.Class.Produto;

import java.util.ArrayList;

public class Main {
    static void main() {
        Produto livro = new Livro("O Pequeno Princípe", 20);
        Produto eletronico = new Eletronico("Celular", 5466);

        ArrayList<Produto>produtos = new ArrayList<>();
        produtos.add(livro);
        produtos.add(eletronico);

        for(Produto p: produtos){
            p.mostrarInformacoes();
            System.out.println("-------");
        }
    }
}
