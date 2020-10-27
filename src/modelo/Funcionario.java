package modelo;

public class Funcionario {
	
	private String login;
	private String senha;
	private String nome;
	private String email;
	
	
	public Funcionario(String login,String senha,String nome,String email) {
		this.login = login;
		this.senha = senha;
		this.nome = nome ;
		this.email =email ;
		
	}

	
	public Funcionario() {
		
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
	public String toString() {
		return "Funcionario [login=" + login + ", senha=" + senha + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
	
}
