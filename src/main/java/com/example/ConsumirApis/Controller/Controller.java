package com.example.ConsumirApis.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.ConsumirApis.Service.Service;
import com.example.ConsumirApis.model.*;


@RestController
public class Controller {

	@Autowired
	Service service;
	

	@GetMapping("/listacep/{cep}")
	public List<ModelCep> ListarCep(@PathVariable("cep") String cep ){

		return service.findByCep(cep);
		
	}
	
	@DeleteMapping("/deletar/{id}")
	public void DeletarCep(@PathVariable("id") Long Id) {
		
		 service.DeleteCep(Id);
	}
	
	
}
