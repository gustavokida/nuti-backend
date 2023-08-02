package com.nuti.teste.pratico.html.infra.http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListaUrlDto {
    @JsonProperty("urls")
    private String urls;
}
