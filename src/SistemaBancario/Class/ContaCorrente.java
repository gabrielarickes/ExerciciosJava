package SistemaBancario.Class;

public class ContaCorrente extends Conta {

    private final double taxa = 5.0;

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double sacar(double valor) {
        if (valor <= 0 || valor + taxa > getSaldo()) {
            return -1;
        }

        setSaldo(getSaldo() - valor - taxa);
        return getSaldo();
    }
}