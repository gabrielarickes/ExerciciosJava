package SistemaDeCadastroDeClientes.Main;

import SistemaDeCadastroDeClientes.Class.CadastroClientes;
import SistemaDeCadastroDeClientes.Class.Cliente;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scan = new Scanner(System.in);

        CadastroClientes cadastro = new CadastroClientes();

        while (true){
            System.out.println("=====CADASTRO DE CLIENTES====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Buscar cliente");
            System.out.println("4 - Remover cliente");
            System.out.println("5 - Sair");
            int op = scan.nextInt();
            scan.nextLine();

            switch (op){
                case 1:
                    System.out.println("Qual o nome do cliente? ");
                    String nome = scan.nextLine();
                    System.out.println("Qual o email do cliente? ");
                    String email = scan.nextLine();
                    System.out.println("Qual o telefone de contato do cliente? ");
                    String telefone = scan.nextLine();

                    Cliente cliente = new Cliente(nome, email, telefone);
                    cadastro.adicionarCliente(cliente);
                    break;

                case 2:
                    cadastro.listarClientes();
                    break;

                case 3:
                    System.out.println("Qual nome deseja buscar? ");
                    String nomeBusca = scan.nextLine();
                    cadastro.buscarCliente(nomeBusca);
                    break;

                case 4:
                    System.out.println("Qual nome deseja remover? ");
                    String nomeRemove = scan.nextLine();
                    cadastro.removerCliente(nomeRemove);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
