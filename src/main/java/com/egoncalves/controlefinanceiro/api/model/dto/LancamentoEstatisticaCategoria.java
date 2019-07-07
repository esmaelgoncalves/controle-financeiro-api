package com.egoncalves.controlefinanceiro.api.model.dto;

import com.egoncalves.controlefinanceiro.api.model.Categoria;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class LancamentoEstatisticaCategoria {
    private Categoria categoria;
    private BigDecimal total;
}
