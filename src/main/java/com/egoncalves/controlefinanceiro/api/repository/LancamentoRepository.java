/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egoncalves.controlefinanceiro.api.model.Lancamento;
import com.egoncalves.controlefinanceiro.api.repository.lancamento.LancamentoRespositoryQuery;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Esmael
 *
 */
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRespositoryQuery{

    List<Lancamento> findByDataVencimentoIsLessThanEqualAndDataPagamentoIsNull(LocalDate date);
}
