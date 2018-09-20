package com.infine.kata;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BuscaFreteTeste {

    @Test // Falaram (o gerente foi num evento de agil) que eu tinha que testar...dai to testando
    public void calcMaisBaratoDeMoto() {

        // valor 0
        assertEquals(20.0, BuscaFrete.calcMaisBarato(50, 0, 32, true, false, false), 0.0);
        assertEquals(50.0, BuscaFrete.calcMaisBarato(50, 0, 32, true, true, false), 0.0);
        assertEquals(50.0, BuscaFrete.calcMaisBarato(50, 0, 32, true, true, true), 0.0);
        assertEquals(20.0, BuscaFrete.calcMaisBarato(50, 0, 32, true, false, true), 0.0);
        assertEquals(0.0, BuscaFrete.calcMaisBarato(50, 0, 32, false, false, false), 0.0);
        assertEquals(20.0, BuscaFrete.calcMaisBarato(70, 0, 690, true, false, false), 0.0);
        assertEquals(-1, BuscaFrete.calcMaisBarato(70, 0, 790, true, false, false), 0.0);

        // valor 99
        assertEquals(465.5, BuscaFrete.calcMaisBarato(50, 99, 32, true, false, false), 0.0);
        assertEquals(495.5, BuscaFrete.calcMaisBarato(50, 99, 32, true, true, false), 0.0);
        assertEquals(545.0, BuscaFrete.calcMaisBarato(50, 99, 32, true, true, true), 0.0);
        assertEquals(396.2, BuscaFrete.calcMaisBarato(50, 99, 32, true, false, true), 0.0);
        assertEquals(316.8, BuscaFrete.calcMaisBarato(50, 99, 32, false, false, false), 0.0);
        assertEquals(465.5, BuscaFrete.calcMaisBarato(70, 99, 690, true, false, false), 0.0);
        assertEquals(-1, BuscaFrete.calcMaisBarato(70, 99, 790, true, false, false), 0.0);

    }

}
