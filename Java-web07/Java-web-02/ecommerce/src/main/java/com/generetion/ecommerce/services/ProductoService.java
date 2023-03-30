package com.generetion.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generetion.ecommerce.model.Producto;
import com.generetion.ecommerce.repositories.ProductoRepository;

@Service

public class ProductoService {

	// Declara la instancia de la clase ProductoRepository
	private final ProductoRepository productoRepository;

	// Cablear con el autowired
	@Autowired

	// Uso ese objeto como parametro de mi constructor
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

//Create (Metodo para agregar un objeto del tipo Producto y guardarlo en la base de datos. Si el producto existe, no deberia actualizar la Base de datos porque seria un objeto duplicado.

	public void crearProducto(Producto prod) { // objeto del tipo producto
		Optional<Producto> productoBuscado = productoRepository.findByNombre(prod.getNombre());
		if (productoBuscado.isPresent()) {
			throw new IllegalStateException("El producto con el nombre " + "[" + prod.getNombre() + "] ya existe.");
		} else {
			productoRepository.save(prod);
		} // else //if
	}// addProducto

	// Read (Leer una lista de productos)
	public List<Producto> leerProducto() {
		return productoRepository.findAll();
	}

	// Read (leer un producto con un id especifico)
	public Producto getProducto(Long prodId) {
		return productoRepository.findById(prodId)
				.orElseThrow(() -> new IllegalStateException("El Producto " + "con el id " + prodId + " no existe."));
	}// getProducto

	// Update
	public void actualizarProducto() {

	}

	// Delete
	public void borrarProducto() {

	}

}
