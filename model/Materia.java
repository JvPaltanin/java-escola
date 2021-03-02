/**
 * 
 */
package model;

/**
 * Classe para armazenar os atributos e métodos do objeto matéria
 * 
 * @author João Victor
 * @since 23/02/2021
 */
public class Materia {

	// delcarando os atributos do objeto matéria
	private int codigo;
	private String nome;

	// métodos para acessar os atributos do objeto
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