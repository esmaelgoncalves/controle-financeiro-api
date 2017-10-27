/**
 * 
 */
package com.egoncalves.controlefinanceiro.api.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.egoncalves.controlefinanceiro.api.model.Usuario;

/**
 * @author Esmael
 *
 */
public class UsuarioSistema extends User {
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	
	public UsuarioSistema(Usuario usuario, Collection<? extends GrantedAuthority> authorities) {
		super(usuario.getEmail(), usuario.getSenha(), authorities);
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
}