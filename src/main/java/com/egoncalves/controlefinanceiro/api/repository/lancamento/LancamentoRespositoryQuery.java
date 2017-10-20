/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.egoncalves.controlefinanceiro.api.model.Lancamento;
import com.egoncalves.controlefinanceiro.api.model.projection.ResumoLancamento;
import com.egoncalves.controlefinanceiro.api.repository.filter.LancamentoFilter;

/**
 * @author Esmael
 *
 */
public interface LancamentoRespositoryQuery {
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
