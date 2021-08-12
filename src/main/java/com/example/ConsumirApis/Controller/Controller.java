package com.example.ConsumirApis.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.ConsumirApis.Service.Service;


@RestController
public class Controller {

	@Autowired
	Service service;
	
	@GetMapping("/{cep}")
	public String ListarCep(@PathVariable("cep") String cep ){

		return service.retornaCep(cep);
		
	}
	
	@DeleteMapping("/deletar/{id}")
	public void DeletarCep(@PathVariable("id") Long Id) {
		
		 service.DeleteCep(Id);
	}
	
	
}
