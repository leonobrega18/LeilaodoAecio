package com.leilaodoaecio.leilao.controller;

import com.leilaodoaecio.leilao.Service.PerfilService;
import com.leilaodoaecio.leilao.model.Perfil;
import com.leilaodoaecio.leilao.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Tag(name = "Perfil")
@Controller
@RequestMapping("/perfis")

public class PerfilController {

    @Autowired
    private PerfilRepository perfilRepository;

    @Autowired
    private PerfilService service;


    @Hidden
    @GetMapping("/novo")
    public String novo(Perfil perfil) {
        return "perfil/novo";
    }

    @Operation(summary = "Salvar Perfil", description = "")
    @PostMapping("/salvar")
    public String salvar(@Valid Perfil perfil) {
         PerfilRepository.save(perfil);
        return "redirect:/perfil/lista";
    }

    @Operation(summary = "Buscar todos os perfis", description = "")
    @GetMapping
    public ResponseEntity<List<Perfil>> findAll() {
        List<Perfil> list = PerfilService.findAll();
        return ResponseEntity.ok().body(list);
    }

}
