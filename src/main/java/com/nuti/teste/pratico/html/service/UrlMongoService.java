package com.nuti.teste.pratico.html.service;

import com.nuti.teste.pratico.html.domain.Url;
import com.nuti.teste.pratico.html.infra.mongo.UrlRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UrlMongoService {
    private final UrlRepository urlRepository;

    public Url salvar(Url url){
        return urlRepository.save(url);
    }
    public void salvarLista(List<Url> urls){
        for(Url url: urls){
            urlRepository.save(url);
        }
    }

    public List<Url> buscarTodos(){
        return urlRepository.findAll();
    }

    public Optional<Url> buscar(String id){
        return urlRepository.findById(id);
    }
}
