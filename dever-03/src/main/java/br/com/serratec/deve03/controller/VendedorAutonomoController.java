package br.com.serratec.deve03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.deve03.model.VendedorAutonomo;
import br.com.serratec.deve03.service.VendedorAutonomoService;

@RestController
@RequestMapping("/vendedoresAutonomos")
public class VendedorAutonomoController {
	
	@Autowired
	private VendedorAutonomoService vendedorAutonomoService;
	
	@GetMapping
	public ResponseEntity<List<VendedorAutonomo>> listar() {
		return ResponseEntity.ok(vendedorAutonomoService.listar());
	}
	
	@PostMapping
	public ResponseEntity<Object> inserir(@RequestBody VendedorAutonomo vendedorAutonomo) {
			return ResponseEntity.ok(vendedorAutonomoService.inserir(vendedorAutonomo));
	}

}
