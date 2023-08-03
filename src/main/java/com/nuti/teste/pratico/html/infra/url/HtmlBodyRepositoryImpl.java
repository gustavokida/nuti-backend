package com.nuti.teste.pratico.html.infra.url;

import com.nuti.teste.pratico.html.shared.exception.LeituraUrlException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Repository;



@Repository
public class HtmlBodyRepositoryImpl implements HtmlBodyRepository {
    public Elements get(String url){
        try{
            Document doc = Jsoup.connect(url).get();
            return doc.getAllElements();
        }catch(Exception e){
            throw new LeituraUrlException(e.getMessage());
        }
    }
}
