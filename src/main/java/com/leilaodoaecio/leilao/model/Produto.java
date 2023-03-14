package com.leilaodoaecio.leilao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produto_id")
    private Integer produto_Id;

    @ManyToOne
    @JoinColumn(name = "usuario_Id")
    private Usuario usuario;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor_reserva")
    private Double valor_reserva;

    @Column(name = "status")
    private Boolean status;

}