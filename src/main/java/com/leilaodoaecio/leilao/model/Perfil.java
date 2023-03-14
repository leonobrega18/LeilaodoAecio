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
    @Column (name = "perfilId")
    private Integer perfilId;

    //@Column (name = "usuarioId")
    //private Integer usuarioId;

    @ManyToOne
    @JoinColumn(name = "usuarioid")
    private Usuario usuario;

    @Column (name = "descricao", length = 50)
    private String descricao;

}
