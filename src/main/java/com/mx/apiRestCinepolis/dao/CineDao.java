package com.mx.apiRestCinepolis.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mx.apiRestCinepolis.model.Cinepolis;



public interface CineDao extends CrudRepository<Cinepolis, Integer>{

	public List<Cinepolis> findByNombre(String nombre);
	public List<Cinepolis> findByGenero(String genero);
}
