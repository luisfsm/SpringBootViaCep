package com.example.ConsumirApis.Service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.client.RestTemplate;

import com.example.ConsumirApis.RepositoryCep;
import com.example.ConsumirApis.model.ModelCep;
import com.google.gson.Gson;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	RepositoryCep repository;
	
	public String retornaCep(String cep) {
	
	RestTemplate restTemplate = new RestTemplate();
	ModelCep model = restTemplate.getForObject("https://viacep.com.br/ws/"+cep+"/json/", ModelCep.class); 
	
	Gson gson = new Gson();
	String Json = gson.toJson(model);
	System.out.println(Json);
	
	
	InsertCep(model);
	
	return Json;
  }
	
	public void InsertCep(ModelCep model) {
		repository.save(model);
		System.out.println("CEP INSERIDO NA BASE : "+model.cep);	
	}
	
	public void DeleteCep(Long Id) {
		ModelCep Entity = repository.getById(Id);
		System.out.println(Entity.cep+" Cep deletado da base");
		repository.delete(Entity);
		
	}
}
