package com.santana.gwtblue.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santana.gwtblue.entidades.Pessoa;
import com.santana.gwtblue.servicos.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> buscarTodos() {
		List<Pessoa> list = service.buscarTodos();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pessoa> buscarPorId(@PathVariable Long id) {
		Pessoa obj = service.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
