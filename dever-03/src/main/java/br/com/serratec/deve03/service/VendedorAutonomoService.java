package br.com.serratec.deve03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.deve03.model.Vendedor;
import br.com.serratec.deve03.model.VendedorAutonomo;
import br.com.serratec.deve03.repository.VendedorAutonomoRepository;

@Service
public class VendedorAutonomoService {
	
	@Autowired
	public VendedorAutonomoRepository vendedorAutonomoRepository;
	
	public List<VendedorAutonomo> listar() {
		return vendedorAutonomoRepository.findAll();
	}
	
	public Vendedor inserir(VendedorAutonomo vendedorAutonomo) {
		return vendedorAutonomoRepository.save(vendedorAutonomo);
	}

}
