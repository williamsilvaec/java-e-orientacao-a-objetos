package com.wsma.fjoo.testesUnitarios;

public class ContadorCaracteres {

    public int contarCaracteres(String frase, char letra) {
        return frase.chars().map(c -> c == letra ? 1 : 0).sum();
    }
}
