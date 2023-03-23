package com.generetion.cohorte23.jpa.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generetion.cohorte23.jpa.models.UsuarioModel;
import com.generetion.cohorte23.jpa.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServices {
@Autowired
UsuarioRepositorio usuariorepositorio;
public ArrayList<UsuarioModel> BusquedaPorPrioridad(Integer prioridad){
	return usuariorepositorio.BusquedaPorPrioridad(prioridad);
}
public ArrayList <UsuarioModel>ListarUsuarios(){
	return (ArrayList<UsuarioModel>) usuariorepositorio.findAll();
	
}
}
