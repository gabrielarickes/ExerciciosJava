package SistemaDePagamento.Class;

public class Boleto implements Pagamento{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("O valor de "+valor+ " foi pago via BOLETO com sucesso!");
    }
}
