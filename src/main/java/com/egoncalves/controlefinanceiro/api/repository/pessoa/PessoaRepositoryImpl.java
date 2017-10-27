/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.repository.pessoa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

import com.egoncalves.controlefinanceiro.api.model.Pessoa;
import com.egoncalves.controlefinanceiro.api.model.Pessoa_;
import com.egoncalves.controlefinanceiro.api.repository.filter.PessoaFilter;

/**
 * @author Esmael
 *
 */
public class PessoaRepositoryImpl implements PessoaRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Pessoa> criteria = builder.createQuery(Pessoa.class);
		Root<Pessoa> root = criteria.from(Pessoa.class);

		Predicate[] predicates = criarRestricoes(pessoaFilter, builder, root);
		criteria.where(predicates);
		adicionarOrdenacao(pageable, builder, criteria, root);

		TypedQuery<Pessoa> query = manager.createQuery(criteria);

		adicionarRestricaoPaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, total(pessoaFilter));
	}
	
	
	private Predicate[] criarRestricoes(PessoaFilter pessoaFilter, CriteriaBuilder builder,
			Root<Pessoa> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (!StringUtils.isEmpty(pessoaFilter.getNome())) {
			predicates.add(builder.like(builder.lower(root.get(Pessoa_.nome)),
					"%" + pessoaFilter.getNome().toLowerCase() + "%"));
		}
		if (!StringUtils.isEmpty(pessoaFilter.getAtivo())) {
			predicates.add(builder.equal(root.get(Pessoa_.ativo), pessoaFilter.getAtivo()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private void adicionarRestricaoPaginacao(TypedQuery<?> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}

	private void adicionarOrdenacao(Pageable pageable, CriteriaBuilder builder, CriteriaQuery<Pessoa> criteria,
			Root<Pessoa> root) {
		Sort sort = pageable.getSort();
		if (sort != null) {
			Sort.Order order = sort.iterator().next();
			String field = order.getProperty();
			criteria.orderBy(order.isAscending() ? builder.asc(root.get(field)) : builder.desc(root.get(field)));
		}
	}

	private Long total(PessoaFilter pessoaFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Pessoa> root = criteria.from(Pessoa.class);

		Predicate[] predicates = criarRestricoes(pessoaFilter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));

		return manager.createQuery(criteria).getSingleResult();
	}
}
