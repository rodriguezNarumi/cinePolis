package com.mx.apiRestCinepolis.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.apiRestCinepolis.model.Cinepolis;



public interface CineDao extends CrudRepository<Cinepolis, Integer>{

}
