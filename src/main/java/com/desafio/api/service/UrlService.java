package com.desafio.api.service;

import com.desafio.api.dominio.UrlEntity;
import com.desafio.api.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    @Autowired
    private UrlRepository repository;

    public void salvar(UrlEntity url) {
        repository.save(url);
    }
    public UrlEntity getUrl(String url){
        return repository.findByUrlEncurtada(url).orElseThrow();
    }

}
