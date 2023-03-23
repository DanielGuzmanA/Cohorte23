package com.generetion.cohorte23.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generetion.cohorte23.app.models.Libro;
import com.generetion.cohorte23.app.repositorios.LibrosRepositorios;

@RestController
public class LibroController {
	@Autowired
	LibrosRepositorios LibroRepo;

	@RequestMapping("/libros")
	public List<Libro> listarTodo() {
		return LibroRepo.listarLibros();

	}
}
