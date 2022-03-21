package com.desafio.api.mapper;

import com.desafio.api.dominio.UrlEntity;
import com.desafio.api.dto.UrlDTO;
import com.desafio.api.util.UrlUtil;

public class UrlMapper {
    public static UrlEntity toEntity(UrlDTO dot){
        return merge(new UrlEntity(),dot);
    }
    private static UrlEntity merge(UrlEntity url, UrlDTO dto){
        url.setUrlEncurtada(UrlUtil.buildAlias(dto.getUrl()));
        url.setUrl(dto.getUrl());
        return url;
    }

    public static UrlDTO toDTO(UrlEntity entity){
        return merge(new UrlDTO(),entity);
    }
    private static UrlDTO merge(UrlDTO dto, UrlEntity url){
        dto.setUrl(url.getUrl());
        return dto;
    }

}
