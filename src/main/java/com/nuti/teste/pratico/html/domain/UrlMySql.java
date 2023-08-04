package com.nuti.teste.pratico.html.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "url")
public class UrlMySql {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "url")
    private String url;
    @OneToMany(mappedBy = "url", cascade = CascadeType.ALL)
    private List<TagMySql> listaTag;
}
