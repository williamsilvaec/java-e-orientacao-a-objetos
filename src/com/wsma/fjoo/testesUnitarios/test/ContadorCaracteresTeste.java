package com.wsma.fjoo.testesUnitarios.test;


import com.wsma.fjoo.testesUnitarios.ContadorCaracteres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ContadorCaracteresTeste {

    private String frase = "Estudando testes unitários";
    private ContadorCaracteres contador;


    @Before
    public void setUp() {
        contador = new ContadorCaracteres();
    }


    @Test
    public void deveContarUmaLetraANaFrase() throws Exception {
        int totalLetras = contador.contarCaracteres(frase, 'a');
        assertEquals(1, totalLetras);
    }

    @Test
    public void deve_contar_tres_letras_t_na_frase() throws Exception {
        int totalLetras = contador.contarCaracteres(frase, 't');
        assertEquals(4, totalLetras);
    }

}