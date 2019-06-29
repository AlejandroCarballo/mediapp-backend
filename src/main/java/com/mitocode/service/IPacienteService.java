package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Paciente;

public interface IPacienteService {

	void registrar(Paciente pac);
	void modificar(Paciente pac);
	List<Paciente> listar();
	Paciente leerPorId(Integer id);
	void eliminar(Integer id);
}
