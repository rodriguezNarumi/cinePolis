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

	@Override
	public Cinepolis buscarXid(int idCine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Cinepolis cine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarXid(int idCinep) {
		// TODO Auto-generated method stub
		
	}

}
