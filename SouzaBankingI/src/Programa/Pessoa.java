package Programa;

public class Pessoa {

	private static int counter = 1;

	String nome;
	String cpf;
	String email;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		counter += 1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "\nNome: " + this.getNome() + "\nCpf: " + this.getCpf() + "\nEmail " + this.getEmail();
	}

}
