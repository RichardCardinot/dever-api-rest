package br.com.serratec.deve03.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
public class VendedorAutonomo extends Vendedor {
	
	@NotNull(message = "A comissão não pode ser nula.")
	@Positive(message = "A comissão não pode ser negativa ou zero.")
	private Double comissao;

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

}
