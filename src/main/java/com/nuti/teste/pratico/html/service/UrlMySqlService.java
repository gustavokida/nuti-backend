package com.nuti.teste.pratico.html.service;

import com.nuti.teste.pratico.html.domain.UrlMySql;
import com.nuti.teste.pratico.html.infra.mysql.UrlMySqlRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UrlMySqlService {
    private final UrlMySqlRepository urlMySqlRepository;

    public void salvarLista(List<UrlMySql> urlsMySql){
        for(UrlMySql url: urlsMySql){
            urlMySqlRepository.save(url);
        }
    }
}
