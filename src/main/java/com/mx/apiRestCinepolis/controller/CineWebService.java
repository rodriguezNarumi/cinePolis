package com.mx.apiRestCinepolis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mx.apiRestCinepolis.model.Cinepolis;
import com.mx.apiRestCinepolis.service.CineServImp;

@RestController
@RequestMapping(path = "CineWebService")
@CrossOrigin

public class CineWebService {
	@Autowired
	//http://localhost:9000/CineWebService/listar
	CineServImp cineImp;
 @GetMapping(path = "listar")
	public List<Cinepolis>listar(){
		return cineImp.listar();
	

}
 @PostMapping(path = "guardar")
	public void guardar(@RequestBody Cinepolis cinepolis) {
		cineImp.guardar(cinepolis);
 
		
}
 //http://localhost:9000/CineWebService/buscarXid
 @PostMapping(path = "buscarXid")
	public Cinepolis buscar(@RequestBody Cinepolis cinepolis) {
		return cineImp.buscarXid(cinepolis.getIdCine());
	}
 //http://localhost:9000/CineWebService/editar
 @PostMapping(path = "editar")
	public void editar(@RequestBody Cinepolis cinepolis) {
		cineImp.editar(cinepolis);
	}
 //http://localhost:9000/CineWebService/eliminar
 @PostMapping("eliminar")
	public void eliminar(@RequestBody Cinepolis cinepolis) {
		cineImp.eliminarXid(cinepolis.getIdCine());
	}
 //http://localhost:9000/CineWebService/buscarXnombre
 @PostMapping("buscarXnombre")
	public List<Cinepolis>buscarXnombre(@RequestBody Cinepolis nombre) {
		return cineImp.buscarXnombre(nombre.getNombre());
	}
 //http://localhost:9000/CineWebService/buscarXgenero
 @PostMapping("buscarXgenero")
	public List<Cinepolis>buscarXgenero(@RequestBody Cinepolis genero) {
		return cineImp.buscarXgenero(genero.getGenero());
	}
}
