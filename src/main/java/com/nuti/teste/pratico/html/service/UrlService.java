package com.nuti.teste.pratico.html.service;

import com.nuti.teste.pratico.html.domain.HtmlBody;
import com.nuti.teste.pratico.html.infra.url.HtmlBodyRepository;
import com.nuti.teste.pratico.html.infra.url.dto.HtmlBodyResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UrlService {
    private final HtmlBodyRepository htmlBodyRepository;
    private final HtmlBodyResponseMapper htmlBodyResponseMapper;

    public HtmlBody get(String url) {
        return htmlBodyResponseMapper.map(htmlBodyRepository.get(url));

    }
}
