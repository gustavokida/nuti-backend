package com.nuti.teste.pratico.html.infra.url;

import com.nuti.teste.pratico.html.shared.exception.LeituraUrlException;
import org.jsoup.select.Elements;

public interface UrlRepository {
    Elements get(String url) throws LeituraUrlException;
}
