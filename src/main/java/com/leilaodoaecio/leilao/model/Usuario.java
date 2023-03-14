package com.leilaodoaecio.leilao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usuario_Id")
    private Integer usuario_Id;
    @Column(name = "login", length = 50)
    private String login;
    @Column(name = "password", length = 50)
    private String password;
    @Column(name = "nome", length = 100)
    private String nome;
    @Column(name = "cpf", length = 20)
    private String cpf;
    @Column(name = "endereco", length = 100)
    private String endereco;

}
