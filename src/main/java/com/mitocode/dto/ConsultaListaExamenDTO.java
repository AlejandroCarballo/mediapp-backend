package com.mitocode.dto;

import java.util.List;

import com.mitocode.model.Consulta;
import com.mitocode.model.Examen;

public class ConsultaListaExamenDTO {

	private Consulta consulta;
	private List<Examen> listExamen;

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public List<Examen> getListExamen() {
		return listExamen;
	}

	public void setListExamen(List<Examen> listExamen) {
		this.listExamen = listExamen;
	}

}
