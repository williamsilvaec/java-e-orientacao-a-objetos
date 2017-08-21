package com.wsma.fjoo.excecoes;

public class TesteExcecoesChecadas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(100);

        try {
            cc.sacar(60);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("saldo: "+cc.getSaldo());

        try {
            cc.sacar(50);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } finally {
          System.out.println("Obrigado por utilizar nosso sistema");
        }
        System.out.println("saldo: "+cc.getSaldo());
    }
}
