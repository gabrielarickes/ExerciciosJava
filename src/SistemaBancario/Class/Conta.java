package SistemaBancario.Class;

public class Conta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        if (valor <= 0) {
            return -1;
        }

        saldo += valor;
        return saldo;
    }

    public double sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return -1;
        }

        saldo -= valor;
        return saldo;
    }

    public void mostraSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}