/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.repository.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.egoncalves.controlefinanceiro.api.model.Pessoa;
import com.egoncalves.controlefinanceiro.api.repository.filter.PessoaFilter;

/**
 * @author Esmael
 *
 */
public interface PessoaRepositoryQuery {
	public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);

}
