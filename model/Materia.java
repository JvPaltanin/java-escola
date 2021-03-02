/**
 * 
 */
package model;

/**
 * Classe para armazenar os atributos e m�todos do objeto mat�ria
 * 
 * @author Jo�o Victor
 * @since 23/02/2021
 */
public class Materia {

	// delcarando os atributos do objeto mat�ria
	private int codigo;
	private String nome;

	// m�todos para acessar os atributos do objeto
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}