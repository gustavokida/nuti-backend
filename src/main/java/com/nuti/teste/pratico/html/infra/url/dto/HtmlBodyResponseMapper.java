package com.nuti.teste.pratico.html.infra.url.dto;

import com.nuti.teste.pratico.html.domain.HtmlBody;
import lombok.AllArgsConstructor;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;



@AllArgsConstructor
@Component
public class HtmlBodyResponseMapper {
    public HtmlBody map(Elements htmlBodyResponse){
        return HtmlBody.builder()
                .body(htmlBodyResponse)
                .build();
    }
}
