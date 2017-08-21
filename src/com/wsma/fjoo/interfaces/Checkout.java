package com.wsma.fjoo.interfaces;

public class Checkout {

    private Operadora operadora;
    private Impressora impressora;

    public Checkout(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fecharComprar(Compra compra, Cartao cartao) {
        boolean autorizavel = this.operadora.autorizar(compra, cartao);

        if (autorizavel) {
            this.impressora.imprimir(compra);
        } else {
            System.out.println("Pagamento foi negado");
        }
    }
}
