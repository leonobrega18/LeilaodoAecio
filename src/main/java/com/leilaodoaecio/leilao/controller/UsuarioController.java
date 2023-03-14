package com.leilaodoaecio.leilao.controller;

import com.leilaodoaecio.leilao.model.Usuario;
import com.leilaodoaecio.leilao.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario P) {
        Usuario obj = usuarioRepository.save(P);
        return ResponseEntity.ok(obj);
    }
}



//{
//        "login": "User_Joao",
//        "password": "123",
//        "nome": "Joao",
//        "cpf": "222222",
//        "endereco": "Rua que sobe e desce"
//}

