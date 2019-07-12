/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egoncalves.controlefinanceiro.api.model.Usuario;

/**
 * @author Esmael
 *
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Optional<Usuario> findByEmail(String email);

	List<Usuario> findByPermissoesDescricao(String permissaoDescricao);
}
