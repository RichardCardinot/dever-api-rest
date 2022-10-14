package br.com.serratec.deve03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.deve03.model.LancamentoVendas;
import br.com.serratec.deve03.service.LancamentoVendasService;

@RestController
@RequestMapping("/lancamentoVendas")
public class LancamentoVendasController {
	
	@Autowired
	private LancamentoVendasService lancamentoVendasService;
	
	@GetMapping
	public ResponseEntity<List<LancamentoVendas>> listar() {
		return ResponseEntity.ok(lancamentoVendasService.listar());
	}
	
	@PostMapping
	public ResponseEntity<Object> inserir(@RequestBody LancamentoVendas lancamentoVendas) {
			return ResponseEntity.ok(lancamentoVendasService.inserir(lancamentoVendas));
	}
}
