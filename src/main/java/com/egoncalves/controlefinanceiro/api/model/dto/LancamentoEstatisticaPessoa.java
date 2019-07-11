package com.egoncalves.controlefinanceiro.api.model.dto;

import com.egoncalves.controlefinanceiro.api.model.Pessoa;
import com.egoncalves.controlefinanceiro.api.model.TipoLancamento;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class LancamentoEstatisticaPessoa {
    private TipoLancamento tipo;
    private Pessoa pessoa;
    private BigDecimal total;
}
