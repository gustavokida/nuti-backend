package com.nuti.teste.pratico.html.infra.http.dto;

import lombok.Getter;

@Getter
public class ConfirmacaoEnvioDto {
    public ConfirmacaoEnvioDto(){
        this.message = "mensagem enviada";
    }
    private final String message;
}
