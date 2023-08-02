package com.nuti.teste.pratico.html.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Document("url")
public class Url {
    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    private String url;
    private List<Tag> listaTag;
}
