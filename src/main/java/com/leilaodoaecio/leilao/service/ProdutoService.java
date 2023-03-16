package com.leilaodoaecio.leilao.service;

import com.leilaodoaecio.leilao.model.Produto;
import com.leilaodoaecio.leilao.dto.ProdutoDTO;
import com.leilaodoaecio.leilao.model.Usuario;
import com.leilaodoaecio.leilao.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private UsuarioRepository usuarioRepository;

//    public Produto criaProduto(ProdutoDTO produtoDTO){
//        Optional<Usuario> usuario = usuarioRepository.findById(produtoDTO.getUsuario());
//
//        Produto novoProduto = new Produto();
//        novoProduto.setDescricao(produtoDTO.getDescricao());
//        novoProduto.setStatus(produtoDTO.getStatus());
//        novoProduto.setValor_reserva(produtoDTO.getValor_reserva());
//        novoProduto.setUsuario(usuario.get());
//
//        return novoProduto;
//    }
}
