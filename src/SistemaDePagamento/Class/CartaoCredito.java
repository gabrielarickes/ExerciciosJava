package SistemaDePagamento.Class;

public class CartaoCredito implements Pagamento{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("O valor de "+valor+ " foi pago via CARTÃO DE CRÉDITO com sucesso!");
    }
}
