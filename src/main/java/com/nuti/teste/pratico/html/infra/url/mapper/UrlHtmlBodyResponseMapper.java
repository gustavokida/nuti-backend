package com.nuti.teste.pratico.html.infra.url.mapper;

import com.nuti.teste.pratico.html.domain.UrlHtmlBody;
import lombok.AllArgsConstructor;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;



@AllArgsConstructor
@Component
public class UrlHtmlBodyResponseMapper {
    public UrlHtmlBody map(Elements urlResponse){
        return UrlHtmlBody.builder()
                .body(urlResponse)
                .build();
    }
}
