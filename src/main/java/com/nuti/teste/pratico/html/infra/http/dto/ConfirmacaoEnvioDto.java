package com.nuti.teste.pratico.html.infra.http.dto;

import lombok.Getter;

@Getter
public class ConfirmacaoEnvioDto {
    public ConfirmacaoEnvioDto(){
        this.message = "Url processada";
    }
    private final String message;
}
