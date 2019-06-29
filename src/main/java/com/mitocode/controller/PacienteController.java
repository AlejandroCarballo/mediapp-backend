package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Paciente;
import com.mitocode.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	private IPacienteService service;
	
	@GetMapping	
	public List<Paciente> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Paciente leerPorId(@PathVariable("id") Integer id) {
		return service.leerPorId(id);
	}
	
	@PostMapping
	public void registrar(@RequestBody Paciente pac) {
		service.registrar(pac);
	}
	
	@PutMapping
	public void modificar(@RequestBody Paciente pac) {
		service.modificar(pac);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
