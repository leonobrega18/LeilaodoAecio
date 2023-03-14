package com.leilaodoaecio.leilao.controller;

import com.leilaodoaecio.leilao.model.Perfil;
import com.leilaodoaecio.leilao.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/perfis")
public class PerfilController {

    @Autowired
    private PerfilRepository perfilRepository;

    @PostMapping
    public ResponseEntity<Perfil> salvar(@RequestBody Perfil P) {
        Perfil obj = perfilRepository.save(P);
        return ResponseEntity.ok(obj);
    }

}