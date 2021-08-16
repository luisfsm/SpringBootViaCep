package com.example.ConsumirApis;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.example.ConsumirApis.model.*;

public interface RepositoryCep extends JpaRepository<ModelCep, Long> {

    List<ModelCep> findByCep(String cepString);

}


