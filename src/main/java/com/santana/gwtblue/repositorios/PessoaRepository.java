package com.santana.gwtblue.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santana.gwtblue.entidades.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
