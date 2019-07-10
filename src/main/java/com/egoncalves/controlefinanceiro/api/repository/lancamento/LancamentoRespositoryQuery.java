/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.repository.lancamento;

import com.egoncalves.controlefinanceiro.api.model.dto.LancamentoEstatisticaCategoria;
import com.egoncalves.controlefinanceiro.api.model.dto.LancamentoEstatisticaDia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.egoncalves.controlefinanceiro.api.model.Lancamento;
import com.egoncalves.controlefinanceiro.api.model.projection.ResumoLancamento;
import com.egoncalves.controlefinanceiro.api.repository.filter.LancamentoFilter;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Esmael
 *
 */
public interface LancamentoRespositoryQuery {

	List<LancamentoEstatisticaCategoria> porCategoria(LocalDate mesReferencia);
	List<LancamentoEstatisticaDia> porDia(LocalDate mesReferencia);

	Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
