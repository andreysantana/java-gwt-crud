package com.santana.gwtblue.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santana.gwtblue.entidades.Pessoa;
import com.santana.gwtblue.repositorios.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> buscarTodos() {
		return repository.findAll();
	}
	
	public Pessoa buscarPorId(Long id) {
		Optional<Pessoa> obj = repository.findById(id);
		return obj.get();
	}
}
