package com.leilaodoaecio.leilao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {

    private Integer usuario;

    private String descricao;

    private Double valor_reserva;

    private Boolean status;
}
