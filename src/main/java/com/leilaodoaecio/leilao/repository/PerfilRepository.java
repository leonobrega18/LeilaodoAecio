package com.leilaodoaecio.leilao.repository;

import com.leilaodoaecio.leilao.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer> {

}
