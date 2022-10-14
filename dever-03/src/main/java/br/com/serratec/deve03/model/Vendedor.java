package br.com.serratec.deve03.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vendedor_id")
	private Long codigo;

	@Size(min = 3, message = "O nome não pode ter menos que 3 caracteres.")
	private String nome;

	@NotBlank(message = "O e-mail não pode ser branco ou nulo.")
	@Email(message = "O e-mail deve conter @ e ponto.")
	private String email;

	@NotNull(message = "O salário não pode ser nulo.")
	@Positive(message = "O salário não pode ser negativo ou zero.")
	private Double salario;

	@JsonManagedReference
	@OneToMany(mappedBy = "vendedor")
	private List<LancamentoVendas> lancamentoVendas;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public List<LancamentoVendas> getLancamentoVendas() {
		return lancamentoVendas;
	}

	public void setLancamentoVendas(List<LancamentoVendas> lancamentoVendas) {
		this.lancamentoVendas = lancamentoVendas;
	}

}
