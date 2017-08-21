package com.wsma.fjoo.excecoes;

public class TesteExcecoes {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(100);

        try {
            cc.depositar(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Você executou um operação ilegal: " + e.getMessage());
        }
    }
}
