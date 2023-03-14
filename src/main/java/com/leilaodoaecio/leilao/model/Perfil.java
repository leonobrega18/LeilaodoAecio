package com.leilaodoaecio.leilao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "perfil")

public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "perfil_Id")
    private Integer perfil_Id;

    @ManyToOne
    @JoinColumn(name = "usuario_Id")
    private Usuario usuario;

    @Column (name = "descricao", length = 50)
    private String descricao;

}
