package SistemaDeFuncionarios.Main;

import SistemaDeFuncionarios.Class.Desenvolvedor;
import SistemaDeFuncionarios.Class.Funcionario;
import SistemaDeFuncionarios.Class.Gerente;

import java.util.ArrayList;

public class Main {
    static void main() {
        Funcionario gerente = new Gerente("Gerônimo", 5360);
        Funcionario desenvolvedor = new Desenvolvedor("Gabriela", 2690);


        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gerente);
        funcionarios.add(desenvolvedor);

        for(Funcionario f: funcionarios){
            f.mostrarInformacoes();
        }
    }
}
