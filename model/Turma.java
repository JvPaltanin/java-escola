package model;

import java.util.ArrayList;

/**
 * Classe para armazenar os atributos e métodos do objeto turma
 * 
 * @author João Victor
 * @since 24/02/2021
 */
public class Turma {

	// delcarando os atributos
	private int codigo;
	private int ano;
	private Professor professor;
	private ArrayList<Aluno> alunos;
	private Materia materia;

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
}