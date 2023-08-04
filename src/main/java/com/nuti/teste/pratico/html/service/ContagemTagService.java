package com.nuti.teste.pratico.html.service;

import com.nuti.teste.pratico.html.domain.UrlHtmlBody;
import com.nuti.teste.pratico.html.domain.Tag;
import com.nuti.teste.pratico.html.domain.Url;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContagemTagService {
    public Url contarTags(UrlHtmlBody urlHtmlBody, Url url){
        List<Tag> listaTag = new ArrayList<>();
        for(Element elemento: urlHtmlBody.getBody()){
            adicionaTag(listaTag, elemento.tagName());
        }
        url.setListaTag(listaTag);
        return url;
    }

    private void adicionaTag(List<Tag> listaTag, String nomeTag){
        if(!nomeTag.equals("#root"))
            adicionaTagEmListaTag(listaTag, nomeTag);
    }

    private void adicionaTagEmListaTag(List<Tag> listaTag, String nomeTag){
        boolean existeTag = false;
        for (Tag value : listaTag) {
            if (value.getNomeTag().equals(nomeTag)) {
                value.setQuantidade(value.getQuantidade() + 1);
                existeTag = true;
                break;
            }
        }
        if(!existeTag){
            Tag novaTag = new Tag(nomeTag, 1);
            listaTag.add(novaTag);
        }
    }

}
