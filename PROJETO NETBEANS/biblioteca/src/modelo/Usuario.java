
package modelo;


public class Usuario {
    
    //atributos
	private String email;
	private String senha;
	private String nome;
	private String endereco;
	private String telefone;
	
	
	//construtor com campos
	public Usuario(String email,String senha,String nome,String endereco,String telefone) {
		this.senha = senha ;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		
	}
	//construtor sem campos

        @Override
        public String toString() {
            return "Usuario{" + "email=" + email + ", senha=" + senha + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + '}';
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
		
}
