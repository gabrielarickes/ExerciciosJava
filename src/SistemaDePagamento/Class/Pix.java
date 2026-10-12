package SistemaDePagamento.Class;

public class Pix implements Pagamento{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("O valor de "+valor+ " foi pago via PIX com sucesso!");

    }
}
