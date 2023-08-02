package com.nuti.teste.pratico.html.infra.url.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class HtmlBodyResponse {
    private String body;
}
