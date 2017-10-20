/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.repository.filter;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.egoncalves.controlefinanceiro.api.model.TipoLancamento;

/**
 * @author Esmael
 *
 */
public class LancamentoFilter {

	private String descricao;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate dataVencimentoDe;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate dataVencimentoAte;
	private TipoLancamento tipoLancamento;

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the dataVencimentoDe
	 */
	public LocalDate getDataVencimentoDe() {
		return dataVencimentoDe;
	}

	/**
	 * @param dataVencimentoDe
	 *            the dataVencimentoDe to set
	 */
	public void setDataVencimentoDe(LocalDate dataVencimentoDe) {
		this.dataVencimentoDe = dataVencimentoDe;
	}

	/**
	 * @return the dataVencimentoAte
	 */
	public LocalDate getDataVencimentoAte() {
		return dataVencimentoAte;
	}

	/**
	 * @param dataVencimentoAte
	 *            the dataVencimentoAte to set
	 */
	public void setDataVencimentoAte(LocalDate dataVencimentoAte) {
		this.dataVencimentoAte = dataVencimentoAte;
	}

	/**
	 * @return the tipoLancamento
	 */
	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	/**
	 * @param tipoLancamento
	 *            the tipoLancamento to set
	 */
	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

}
