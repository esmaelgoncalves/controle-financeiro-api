/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egoncalves.controlefinanceiro.api.model.Usuario;

/**
 * @author Esmael
 *
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByEmail(String email);

}
