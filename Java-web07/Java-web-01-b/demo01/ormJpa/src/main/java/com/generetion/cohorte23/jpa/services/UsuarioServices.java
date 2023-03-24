package com.generetion.cohorte23.jpa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generetion.cohorte23.jpa.models.UsuarioModel;
import com.generetion.cohorte23.jpa.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServices {
	@Autowired
	UsuarioRepositorio usuariorepositorio;

	public boolean eliminarUsuario(Long id) {
		try {

			usuariorepositorio.deleteById(id);
			;
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public ArrayList<UsuarioModel> ListarUsuarios() {
		return (ArrayList<UsuarioModel>) usuariorepositorio.findAll();

	}

	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuariorepositorio.save(usuario);
	}

	public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad) {
		return usuariorepositorio.findByPrioridad(prioridad);
	}

	public Optional<UsuarioModel> obtenerPorId(Long id) {
		return usuariorepositorio.findById(id);

	}

}
