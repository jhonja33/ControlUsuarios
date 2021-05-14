package com.jjbg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjbg.model.Usuario;
import com.jjbg.service.IUsuario;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/usuario")
public class Controlador {
	
	@Autowired
	private IUsuario repositorio;
	
	@GetMapping
	public List<Usuario> getUsuarios(){
		return repositorio.findAll();
	}
	
	@PostMapping
	public Object agregarUsuario(@RequestBody Usuario u) {
		return repositorio.save(u);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminarUsuario(@PathVariable int id) {
		repositorio.deleteById(id);
	}
	
	@GetMapping(value = "/{id}")
	public Object getUsuario(@PathVariable int id) {
		return repositorio.findById(id);
	}
	
	@PutMapping
	public void actualizarUsuario(@RequestBody Usuario u) {
		repositorio.saveAndFlush(u);
	}
	
}
