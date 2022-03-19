package com.desafio.api.mapper;

import com.desafio.api.dominio.UrlEntity;
import com.desafio.api.dto.UrlDTO;

public class UrlMapper {
    public static UrlEntity toEntity(UrlDTO dot){
        return merge(new UrlEntity(),dot);
    }
    private static UrlEntity merge(UrlEntity url, UrlDTO dto){
        url.setUrl(dto.getUrl());
        return url;
    }
}
