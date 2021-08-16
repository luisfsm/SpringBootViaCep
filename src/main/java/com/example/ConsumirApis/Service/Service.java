package com.example.ConsumirApis.Service;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.client.RestTemplate;

import java.util.List;

import com.example.ConsumirApis.RepositoryCep;
import com.example.ConsumirApis.model.ModelCep;
import com.google.gson.Gson;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	RepositoryCep repository;
	
	public List<ModelCep> findByCep(String cep) {
	
	cep = cep.replace("-", "");	
	System.out.println(cep);
	List<ModelCep> retorno = repository.findByCep(cep);

	if(retorno.isEmpty()){
		ConsultaViacep(cep);
	}
	return repository.findByCep(cep);
  }

  	public ModelCep ConsultaViacep(String cep){
		RestTemplate restTemplate = new RestTemplate();
		ModelCep modelCep = restTemplate.getForObject("https://viacep.com.br/ws/"+cep+"/json/", ModelCep.class); 
		modelCep.setCep(cep.replace("-", ""));
		Gson gson = new Gson();
		String Json = gson.toJson(modelCep);
		System.out.println(Json);
		InsertCep(modelCep);	
		return modelCep;
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
