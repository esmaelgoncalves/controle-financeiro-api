/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egoncalves.controlefinanceiro.api.model.Categoria;

/**
 * @author Esmael
 *
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
