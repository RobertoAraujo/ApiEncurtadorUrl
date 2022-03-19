package com.desafio.api.service;

import com.desafio.api.dominio.UrlEntity;
import com.desafio.api.dto.UrlDTO;
import com.desafio.api.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    @Autowired
    private UrlRepository repository;

    public void salva(UrlEntity url){
        repository.save(url);
    }
    public UrlEntity converter(UrlEntity url){
        String antigaUrl = url.getUrl();
        String novaUrl = antigaUrl.replace("http://www.", "");
        return url;
    }
}
