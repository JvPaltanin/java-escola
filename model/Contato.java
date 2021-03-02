/**
 * 
 */
package model;

/**
 * classe para armazenar os atributos e métodos do objeto Contato
 * 
 * @author João Victor
 * @since 23/02/2021
 */
public class Contato {

	// declarando os atributos do objeto Contato
	private String celular;
	private String email;

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}