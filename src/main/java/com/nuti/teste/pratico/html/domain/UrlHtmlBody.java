package com.nuti.teste.pratico.html.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.jsoup.select.Elements;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class UrlHtmlBody {
    private Elements body;
}
