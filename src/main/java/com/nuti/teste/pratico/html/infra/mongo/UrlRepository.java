package com.nuti.teste.pratico.html.infra.mongo;

import com.nuti.teste.pratico.html.domain.Url;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends MongoRepository<Url, String> {
}
