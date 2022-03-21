package com.desafio.api.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Util {
    @Test
    public void testeGeracaoUrl(){
        String resultado = UrlUtil.buildAlias("https://www.google.com.br/teste?teste/teste");
        Assertions.assertEquals("google.com.br", resultado);
        //Assertions.assertEquals("google.com.brr", resultado);
    }
    @Test
    public void testeGeracaoUrlNull(){
        String resultado = UrlUtil.buildAlias("");
        Assertions.assertEquals("google.com.br", resultado);
        //Assertions.assertEquals("google.com.brr", resultado);
    }
}
