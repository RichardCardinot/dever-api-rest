package br.com.serratec.deve03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.deve03.model.Vendedor;
import br.com.serratec.deve03.repository.VendedorRepository;

@Service
public class VendedorService {
	
	@Autowired
	private VendedorRepository vendedorRepository;
	
	public List<Vendedor> listar() {
		return vendedorRepository.findAll();
	}
	
	public Vendedor inserir(Vendedor vendedor) {
		return vendedorRepository.save(vendedor);
	}

}
