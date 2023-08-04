package com.nuti.teste.pratico.html.infra.mysql;

import com.nuti.teste.pratico.html.domain.UrlMySql;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlMySqlRepository extends CrudRepository<UrlMySql, Long> {
}
