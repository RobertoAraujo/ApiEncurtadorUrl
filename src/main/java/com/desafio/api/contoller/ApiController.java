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

    @PostMapping(value = "/salvar")
    public ResponseEntity<UrlDTO> salvarUrl(@RequestBody UrlDTO urlDto){
        UrlEntity urlEntity = UrlMapper.toEntity(urlDto);
//        if (urlDto.getUrl() == null)
//            throw  new UrlNullExepiton();
        service.salvar(urlEntity);
        urlDto.setUrl(urlEntity.getUrlEncurtada());
        return ResponseEntity.ok().body(urlDto);
    }

    @PostMapping(value = "/buscar")
    public ResponseEntity<UrlDTO> getUrl(@RequestBody UrlDTO urlDto){
        return ResponseEntity.ok(UrlMapper.toDTO(service.getUrl(urlDto.getUrl())));
    }
}
