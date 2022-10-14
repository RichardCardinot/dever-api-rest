package br.com.serratec.deve03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.deve03.model.LancamentoVendas;
import br.com.serratec.deve03.repository.LancamentoVendasRepository;

@Service
public class LancamentoVendasService {
	
	@Autowired
	private LancamentoVendasRepository lancamentoVendasRepository;
	
	public List<LancamentoVendas> listar() {
		return lancamentoVendasRepository.findAll();
	}
	
	public LancamentoVendas inserir (LancamentoVendas lancamentoVendas) {
		return lancamentoVendasRepository.save(lancamentoVendas);
	}

}
