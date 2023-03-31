package com.generetion.ecommerce;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.generetion.ecommerce.model.Producto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureMockMvc

class EcommerceApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void pruebaGET() throws Exception {
		this.mockMvc.perform(get("/miOtzo/productos/1")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("papas sabritas")));

	}// Prueba get

	@Test
	@Disabled("Deshabilitado porque ya fue aprobado")
	public void pruebaDELETE() throws Exception {
		this.mockMvc.perform(get("/miOtzo/productos/2")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("cacahuates")));

	}// Prueba Delete

	@Test
	public void pruebaPOST() throws Exception {
		Producto p = new Producto();
		p.setNombre("chocolate Snickers");
		p.setDescripcion("chocolate Snickers");
		p.setURL_Imagen("chocolateSnickers.jpg");
		p.setPrecio(20);

		this.mockMvc
				.perform(post("/miOtzo/productos/").contentType(MediaType.APPLICATION_JSON).content(asJsonString(p)))
				.andDo(print()).andExpect(status().isOk());
	}// Prueba Post
	
	@Test
    public void pruebaPUT() throws Exception {
        this.mockMvc.perform(put("/api/productos/10")
                .queryParam("imagen", "producto_x.jpg")
                )
        .andDo( print() )
        .andExpect( status().isOk() )
        
        .andExpect( content().string( 
                containsString("producto_x.jpg")
                ) );
    }//pruebaPUT
	
	private static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} // catch
	} // asJsonString

}
