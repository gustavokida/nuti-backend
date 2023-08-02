package com.nuti.teste.pratico.html.infra.http.mapper;

import com.nuti.teste.pratico.html.domain.Url;
import com.nuti.teste.pratico.html.infra.http.dto.ListaContagemTagDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class ListaUrlDtoMapper {
    public ListaContagemTagDto map(List<Url> listaUrl){
        return ListaContagemTagDto.builder()
                .listaContagem(listaUrl)
                .build();
    }
}
