package com.leilaodoaecio.leilao.controller;

import com.leilaodoaecio.leilao.model.Produto;
import com.leilaodoaecio.leilao.dto.ProdutoDTO;
import com.leilaodoaecio.leilao.repository.ProdutoRepository;
import com.leilaodoaecio.leilao.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private ProdutoService service;

//    @PostMapping
//    public ResponseEntity<Produto> salvar(@RequestBody ProdutoDTO produto) {
//        Produto response = repository.save(service.criaProduto(produto));
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto) {
        Produto response = repository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}


//{"usuario": {
//        "usuario_Id": 1,
//        "login": "User_Joao",
//        "password": "123",
//        "nome": "Joao",
//        "cpf": "222222",
//        "endereco": "Rua que sobe e desce"
//        },
//        "descricao": "produto para vender",
//        "valor_reserva": "10",
//        "status": "false"
//}