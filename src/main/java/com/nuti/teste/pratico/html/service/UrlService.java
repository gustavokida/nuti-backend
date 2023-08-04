package com.nuti.teste.pratico.html.service;

import com.nuti.teste.pratico.html.domain.UrlHtmlBody;
import com.nuti.teste.pratico.html.infra.url.UrlRepository;
import com.nuti.teste.pratico.html.infra.url.mapper.UrlHtmlBodyResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UrlService {
    private final UrlRepository urlRepository;
    private final UrlHtmlBodyResponseMapper urlHtmlBodyResponseMapper;

    public UrlHtmlBody get(String url) {
        return urlHtmlBodyResponseMapper.map(urlRepository.get(url));

    }
}
