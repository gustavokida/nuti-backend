package com.nuti.teste.pratico.html.service;

import com.nuti.teste.pratico.html.domain.Url;
import com.nuti.teste.pratico.html.infra.mongo.UrlMongoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UrlMongoService {
    private final UrlMongoRepository urlMongoRepository;

    public Url salvar(Url url){
        return urlMongoRepository.save(url);
    }
    public void salvarLista(List<Url> urls){
        for(Url url: urls){
            urlMongoRepository.save(url);
        }
    }

    public List<Url> buscarTodos(){
        return urlMongoRepository.findAll();
    }

    public Optional<Url> buscar(String id){
        return urlMongoRepository.findById(id);
    }
}
