/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egoncalves.controlefinanceiro.api.model.Pessoa;

/**
 * @author Esmael
 *
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
