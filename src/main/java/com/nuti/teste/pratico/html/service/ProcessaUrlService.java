package com.nuti.teste.pratico.html.service;

import com.nuti.teste.pratico.html.domain.HtmlBody;
import com.nuti.teste.pratico.html.domain.Url;
import com.nuti.teste.pratico.html.shared.exception.LeituraUrlException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProcessaUrlService {
    private final ContagemTagService contagemTagService;
    private final UrlService urlService;
    public List<Url> execute(List<String> listaUrl) {
        List<Url> listaUrlProcessada = new ArrayList<>();
        for(String url: listaUrl){
            Url urlProcessada = Url.builder().url(url).build();
            HtmlBody htmlBody = urlService.get(url);
            contagemTagService.contarTags(htmlBody, urlProcessada);
            listaUrlProcessada.add(urlProcessada);
        }
        System.out.println("lista processada com sucesso");
        return listaUrlProcessada;
    }
}
