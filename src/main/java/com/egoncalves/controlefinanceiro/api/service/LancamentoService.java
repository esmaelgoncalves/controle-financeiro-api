/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egoncalves.controlefinanceiro.api.model.Lancamento;
import com.egoncalves.controlefinanceiro.api.model.Pessoa;
import com.egoncalves.controlefinanceiro.api.repository.LancamentoRepository;
import com.egoncalves.controlefinanceiro.api.repository.PessoaRepository;
import com.egoncalves.controlefinanceiro.api.service.exception.PessoaInexistenteOuInativaException;

/**
 * @author Esmael
 *
 */
@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}
}
