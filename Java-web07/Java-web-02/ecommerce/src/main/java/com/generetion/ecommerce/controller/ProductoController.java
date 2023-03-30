package com.generetion.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.generetion.ecommerce.model.Producto;
import com.generetion.ecommerce.services.ProductoService;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
        RequestMethod.PUT })


@RestController  //que eres un controller para soportar metodos http
@RequestMapping(path = "/miOtzo/productos/") //indica la ruta o URL de nuestro endpoint para saber donde se manejan

public class ProductoController {

	// Declara la instancia de la Clase ProductoService que se utiliza para acceder
	// a los metodos definidos ahi.Se declara como final porque su valor no sera
	// cambiado despues de inicializar, para que esta instancia no cambie durante la
	// ejecucion del programa

	private final ProductoService productoServicio; // "no nos llames, nosotros te llamamos"

	@Autowired // Se usa para indicar a Spring que inyecte automaticamente una instancia del
				// ProductoService en la clase ProductoController. Asi nos aseguramos que la
				// instancia esta disponible y lista para usarse cuando se necesite en la clase.

	// Constructor con ese objeto como parametro
	public ProductoController(ProductoService productoServicio) {
		this.productoServicio = productoServicio;
	}// constructor

	// HTTP GET para todos los productos
	@GetMapping
	public List<Producto> getProductos(){
		return productoServicio.leerProducto();
	}


	//HTTP POST
    @PostMapping
    public void postProducto(@RequestBody Producto prod) {
        productoServicio.crearProducto(prod);
    }

/*
	// HTTP PUT
	@PutMapping
	public putProducto() {
		return productoServicio.actualizarProducto();
	}

	// HTTP DELETE
	@DeleteMapping
	public deleteProducto() {
		return productoServicio.borrarProducto();
	}
*/
}
