package com.mx.apiRestCinepolis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.apiRestCinepolis.model.Cinepolis;
import com.mx.apiRestCinepolis.service.CineServImp;

@RestController
@RequestMapping(path = "CineWebService")
@CrossOrigin

public class CineWebService {
	@Autowired
	CineServImp cineImp;
 @GetMapping(path = "listar")
	public List<Cinepolis>listar(){
		return cineImp.listar();
	

}
}
