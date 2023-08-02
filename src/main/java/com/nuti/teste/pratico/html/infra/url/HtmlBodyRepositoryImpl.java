package com.nuti.teste.pratico.html.infra.url;

import com.nuti.teste.pratico.html.infra.url.dto.HtmlBodyResponse;
import com.nuti.teste.pratico.html.shared.exception.LeituraUrlException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;



@Repository
public class HtmlBodyRepositoryImpl implements HtmlBodyRepository {
    private final WebClient.Builder webClientBuilder;

    public HtmlBodyRepositoryImpl(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    public Elements get(String url){
//        return webClientBuilder
//                .build()
//                .get()
//                .uri(url)
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();

        try{
            Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
            return doc.getAllElements();
        }catch(Exception e){
            throw new LeituraUrlException(e.getMessage());
        }
    }
}
