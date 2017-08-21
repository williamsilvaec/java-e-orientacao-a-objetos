package com.wsma.fjoo.interfaces;

public class TesteCheckout {

    public static void main(String[] args) {
        Operadora operadora = new Cielo();
        Impressora impressora = new Hp();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("João M Couves");
        cartao.setNumeroCartao("123");

        Compra compra = new Compra();
        compra.setNomeCliente("João Mendonça das Couves");
        compra.setProduto("sabonete");
        compra.setValorTotal(2.5);

        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharComprar(compra, cartao);

    }
}
