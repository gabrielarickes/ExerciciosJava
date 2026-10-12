package SistemaDePagamento.Main;

import SistemaDePagamento.Class.Boleto;
import SistemaDePagamento.Class.CartaoCredito;
import SistemaDePagamento.Class.Pagamento;
import SistemaDePagamento.Class.Pix;

public class Main {
    static void main() {
        Pagamento pix = new Pix();
        Pagamento boleto = new Boleto();
        Pagamento cartao = new CartaoCredito();

        pix.realizarPagamento(25);
        boleto.realizarPagamento(60);
        boleto.realizarPagamento(500);
    }
}
