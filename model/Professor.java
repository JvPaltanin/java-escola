package model;

import java.util.ArrayList;

/**
 * Classe responsável por armazenar os atributos e métodos do objeto Professor
 * 
 * @author João Victor
 * @since 23/02/2021
 */
public class Professor extends Funcionario {

	// declarando os atributos do professor
	private ArrayList<Materia> listaMaterias;

	public ArrayList<Materia> getListaMaterias() {
		return listaMaterias;
	}

	public void setListaMaterias(ArrayList<Materia> listaMaterias) {
		this.listaMaterias = listaMaterias;
	}

}