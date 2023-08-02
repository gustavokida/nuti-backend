package com.nuti.teste.pratico.html.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Tag {
    private String nomeTag;
    private Integer quantidade;
}
