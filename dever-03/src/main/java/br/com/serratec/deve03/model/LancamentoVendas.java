package br.com.serratec.deve03.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class LancamentoVendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "venda_id")
	private Long codigoVenda;

	@Column(name = "data_venda")
	private LocalDate dataVenda;
	
	@Column(name = "valor_venda")
	private Double valorVenda;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "vendedor_id")
	private Vendedor vendedor;

	public Long getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(Long codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	
}
