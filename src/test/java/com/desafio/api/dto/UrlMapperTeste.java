package com.desafio.api.base;

import com.desafio.api.dominio.UrlEntity;
import com.desafio.api.dto.UrlDTO;
import com.desafio.api.mapper.UrlMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UrlMapperTeste {

    @Test
    public void testeToDTO(){
        UrlDTO urlDTO = UrlMapper.toDTO(new UrlEntity());
        urlDTO.setUrl("String 1");
        Assertions.assertEquals(new UrlDTO(), urlDTO);
    }
}
