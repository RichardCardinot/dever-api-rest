package br.com.serratec.deve03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.deve03.model.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

}
