package br.com.serratec.deve03.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.deve03.model.Vendedor;
import br.com.serratec.deve03.service.VendedorService;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {
	
	@Autowired
	private VendedorService vendedorService;
	
	@GetMapping
	public ResponseEntity<List<Vendedor>> listar() {
		return ResponseEntity.ok(vendedorService.listar());
	}
	
	@PostMapping
	public ResponseEntity<Object> inserir(@Valid @RequestBody Vendedor vendedor) {
			return ResponseEntity.ok(vendedorService.inserir(vendedor));
			
	}
 
}
