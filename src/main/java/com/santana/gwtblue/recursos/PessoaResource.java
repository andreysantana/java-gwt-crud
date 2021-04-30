package com.santana.gwtblue.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santana.gwtblue.entidades.Pessoa;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {
	
	@GetMapping
	public ResponseEntity<Pessoa> buscarTodos() {
		Pessoa p = new Pessoa(null, "Andrey de Santana", 32, 'M', "Rua Bogotá");
		return ResponseEntity.ok().body(p);
	}
}
