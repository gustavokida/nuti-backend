package com.nuti.teste.pratico.html.infra.http.mapper;

import com.nuti.teste.pratico.html.domain.Tag;
import com.nuti.teste.pratico.html.domain.TagMySql;
import com.nuti.teste.pratico.html.domain.Url;
import com.nuti.teste.pratico.html.domain.UrlMySql;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
public class UrlMySqlMapper {
    public List<UrlMySql> map(List<Url> listaUrlMongo){
        List<UrlMySql> listaUrl = new ArrayList<>();
        for(Url urlMongo: listaUrlMongo){
            List<TagMySql> listaTag = new ArrayList<>();
            var url = UrlMySql.builder()
                    .url(urlMongo.getUrl())
                    .listaTag(listaTag)
                    .build();
            for(Tag tag: urlMongo.getListaTag()){
                listaTag.add(TagMySql.builder()
                        .nomeTag(tag.getNomeTag())
                        .quantidade(tag.getQuantidade())
                        .url(url)
                        .build());
            }
            listaUrl.add(url);
        }

        return listaUrl;
    }
}
