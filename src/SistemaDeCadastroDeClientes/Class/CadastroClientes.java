package SistemaDeCadastroDeClientes.Class;

import java.util.ArrayList;
import java.util.Iterator;

public class CadastroClientes {
    private ArrayList<Cliente>clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente){
        if(cliente.getNome().isBlank() || cliente.getEmail().isBlank()){
            System.out.println("Informe todos os campos");
        }
        else {
            clientes.add(cliente);
            System.out.println("Cliente adicionado com sucesso!");
        }
    }
    public void listarClientes(){
        if(clientes.isEmpty()){
            System.out.println("Lista vazia");
        }
        else {
            System.out.println("---Clientes Cadastrados---");
            for (Cliente c : clientes) {
                System.out.println("Nome: " + c.getNome());
                System.out.println("Email: " + c.getEmail());
                System.out.println("Telefone: " + c.getTelefone());
                System.out.println("----------------------------");
            }
        }
    }
    public void buscarCliente(String nome) {
        boolean verifica = false;
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("Telefone: " + cliente.getTelefone());
                verifica = true;
                break;
            }
        }
        if (!verifica) {
            System.out.println("Cliente não encontrado");
        }
    }
    public void removerCliente(String nome){
            boolean verifica = false;
                Iterator<Cliente> iterator = clientes.iterator();

                while (iterator.hasNext()) {
                    Cliente cliente = iterator.next();

                    if (cliente.getNome().equalsIgnoreCase(nome)) {
                        iterator.remove();
                        verifica = true;
                        System.out.println("Cliente removido com sucesso!");
                        break;
                    }
                }
        if (!verifica) {
            System.out.println("Cliente não encontrado");
        }
            }

    }


