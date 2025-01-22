package com.mx.apiRestCinepolis.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.mx.apiRestCinepolis.dao.CineDao;
import com.mx.apiRestCinepolis.model.Cinepolis;
@Service
public class CineServImp implements CineServ {
	

	@Autowired 
    CineDao dao;
	@Transactional 

	@Override
	public void guardar(Cinepolis cinepolis) {
		dao.save(cinepolis);
		
		
	}
	
	@Transactional(readOnly = true)

	@Override
	public List<Cinepolis> listar() {
		
		return  (List<Cinepolis>) dao.findAll(); 
	}
	  @Transactional(readOnly = true)
	@Override
	public Cinepolis buscarXid(int idCine) {
		Cinepolis peliEncontrada = dao.findById(idCine).orElse(null);
		return peliEncontrada;
	}
	  @Transactional
	@Override
	public void editar(Cinepolis cinepolis) {
		dao.save(cinepolis);
		
	}
	  @Transactional
	@Override
	public void eliminarXid(int idCinep) {
		dao.deleteById(idCinep);
		
	}
	@Transactional(readOnly = true)
	@Override
	public List<Cinepolis> buscarXnombre(String nombre) {
		List<Cinepolis> lista = dao.findByNombre(nombre);
		return lista;
	}
	@Transactional(readOnly = true)
	@Override
	public List<Cinepolis> buscarXgenero(String genero) {
		List<Cinepolis>lista = dao.findByGenero(genero);
		return lista;
	}

}
