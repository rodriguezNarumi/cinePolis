package com.mx.apiRestCinepolis.service;

import java.util.List;

import com.mx.apiRestCinepolis.model.Cinepolis;


public interface CineServ {
	
	public void guardar(Cinepolis cinepolis);
	public List<Cinepolis>listar();
	public Cinepolis buscarXid(int idCine);
	public void editar(Cinepolis  cinepolis);
	public void eliminarXid(int idCinep);
	
	public List<Cinepolis> buscarXnombre(String nombre);
	public List<Cinepolis> buscarXgenero(String genero);

}
