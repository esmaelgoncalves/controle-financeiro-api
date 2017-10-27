/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egoncalves.controlefinanceiro.api.model.Pessoa;
import com.egoncalves.controlefinanceiro.api.repository.pessoa.PessoaRepositoryQuery;

/**
 * @author Esmael
 *
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery{

}
