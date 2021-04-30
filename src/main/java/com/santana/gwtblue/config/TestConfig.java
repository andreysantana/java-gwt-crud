package com.santana.gwtblue.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.santana.gwtblue.entidades.Pessoa;
import com.santana.gwtblue.repositorios.PessoaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p1 = new Pessoa(null, "Pessoa 1", 18, 'F', "Endereco 1");
		Pessoa p2 = new Pessoa(null, "Pessoa 2", 20, 'M', "Endereco 2");
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2));
		
	}
}
