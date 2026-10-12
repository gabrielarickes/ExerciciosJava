package SistemaBancario.Main;

import SistemaBancario.Class.Conta;
import SistemaBancario.Class.ContaCorrente;
import SistemaBancario.Class.ContaPoupanca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Conta contaC = new ContaCorrente(500);
        Conta contaP = new ContaPoupanca(550);

        while (true) {

            System.out.println("\n=== SISTEMA BANCÁRIO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Mostrar saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int op = scan.nextInt();

            if (op == 4) {
                System.out.println("Programa encerrado!");
                break;
            }

            if (op < 1 || op > 3) {
                System.out.println("Opção inválida!");
                continue;
            }

            System.out.println("\nEscolha a conta:");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.print("Opção: ");

            int op2 = scan.nextInt();

            Conta contaSelecionada;

            if (op2 == 1) {
                contaSelecionada = contaC;
            } else if (op2 == 2) {
                contaSelecionada = contaP;
            } else {
                System.out.println("Conta inválida!");
                continue;
            }

            if (op == 3) {
                contaSelecionada.mostraSaldo();
                continue;
            }

            System.out.print("Digite o valor: ");
            double valor = scan.nextDouble();

            double resultado;

            if (op == 1) {
                resultado = contaSelecionada.depositar(valor);

                if (resultado == -1) {
                    System.out.println("Valor de depósito inválido!");
                } else {
                    System.out.println("Depósito realizado com sucesso!");
                    contaSelecionada.mostraSaldo();
                }

            } else {
                resultado = contaSelecionada.sacar(valor);

                if (resultado == -1) {
                    System.out.println(
                            "Saque inválido ou saldo insuficiente!"
                    );
                } else {
                    System.out.println("Saque realizado com sucesso!");
                    contaSelecionada.mostraSaldo();
                }
            }
        }

        scan.close();
    }
}