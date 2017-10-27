/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.repository.filter;

/**
 * @author Esmael
 *
 */
public class PessoaFilter {

	private String nome;
	private Boolean ativo;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the ativo
	 */
	public Boolean getAtivo() {
		return ativo;
	}

	/**
	 * @param ativo
	 *            the ativo to set
	 */
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
