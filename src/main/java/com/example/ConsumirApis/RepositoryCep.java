package com.example.ConsumirApis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ConsumirApis.model.*;

public interface RepositoryCep extends JpaRepository<ModelCep, Long> {

}
