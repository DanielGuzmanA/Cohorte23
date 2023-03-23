package com.generetion.cohorte23.jpa.repositorios;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.generetion.cohorte23.jpa.models.UsuarioModel;

@Repository
public interface UsuarioRepositorio extends CrudRepository<UsuarioModel, Long> {
	public ArrayList<UsuarioModel> BusquedaPorPrioridad(Integer prioridad);

}
