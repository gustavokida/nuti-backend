package com.nuti.teste.pratico.html.infra.http.dto;

import com.nuti.teste.pratico.html.domain.Url;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class ListaContagemTagDto {
    private List<Url> listaUrlTagsContadas;
}
