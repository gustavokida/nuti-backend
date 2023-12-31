package com.nuti.teste.pratico.html.infra.http;

import com.nuti.teste.pratico.html.infra.http.dto.ConfirmacaoEnvioDto;
import com.nuti.teste.pratico.html.infra.http.dto.ListaContagemTagDto;
import com.nuti.teste.pratico.html.infra.http.dto.ListaUrlDto;
import com.nuti.teste.pratico.html.infra.http.mapper.ListaUrlDtoMapper;
import com.nuti.teste.pratico.html.infra.http.mapper.UrlMySqlMapper;
import com.nuti.teste.pratico.html.service.ProcessaUrlService;
import com.nuti.teste.pratico.html.service.UrlMongoService;
import com.nuti.teste.pratico.html.service.UrlMySqlService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class UrlController {
    private final ProcessaUrlService processaUrlService;
    private final UrlMongoService urlMongoService;
    private final UrlMySqlService urlMySqlService;
    private final ListaUrlDtoMapper listaUrlDtoMapper;
    private final UrlMySqlMapper urlMySqlMapper;

    @GetMapping("/listar")
    public ResponseEntity<ListaContagemTagDto> listar(){
        var listaUrls = urlMongoService.buscarTodos();
        var listaUrlsDto = listaUrlDtoMapper.map(listaUrls);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(listaUrlsDto);
    }

    @PostMapping("/enviar")
    public ResponseEntity<ConfirmacaoEnvioDto> enviar(@RequestBody ListaUrlDto urls) {
        List<String> listaUrl = Arrays.stream(urls.getUrls().split("\n")).toList();
        var listaUrlProcessada = processaUrlService.execute(listaUrl);
        var listaUrlMySql = urlMySqlMapper.map(listaUrlProcessada);
        urlMongoService.salvarLista(listaUrlProcessada);
        urlMySqlService.salvarLista(listaUrlMySql);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ConfirmacaoEnvioDto());
    }
}
