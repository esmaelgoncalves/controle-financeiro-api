package com.egoncalves.controlefinanceiro.api.model.dto;

import com.egoncalves.controlefinanceiro.api.model.TipoLancamento;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class LancamentoEstatisticaDia {
    private TipoLancamento tipo;
    private LocalDate dia;
    private BigDecimal total;
}
