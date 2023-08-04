package com.nuti.teste.pratico.html.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tag")
public class TagMySql {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "url_id")
    private UrlMySql url;
    @Column(name = "nome_tag")
    private String nomeTag;
    @Column(name = "quantidade")
    private Integer quantidade;
}
