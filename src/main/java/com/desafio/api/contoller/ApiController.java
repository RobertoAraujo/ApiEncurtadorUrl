package com.desafio.api.contoller;

import com.desafio.api.dominio.UrlEntity;
import com.desafio.api.dto.UrlDTO;
import com.desafio.api.mapper.UrlMapper;
import com.desafio.api.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/url")
public class ApiController {
    @Autowired
    private UrlService service;

    @PostMapping(value = "/")
    public ResponseEntity<UrlDTO> salvarUrl(@RequestBody UrlDTO urlDto){
        UrlEntity urlEntity = UrlMapper.toEntity(urlDto);
        service.salva(urlEntity);
        UrlEntity converter = service.converter(urlEntity);
        return ResponseEntity.ok().body(urlDto);
    }
}
