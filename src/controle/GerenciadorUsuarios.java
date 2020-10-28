package controle;
import java.util.ArrayList;

import modelo.Usuario;

public class GerenciadorUsuarios {
	
	private ArrayList<Usuario> listaUsuarios ;
	
	public GerenciadorUsuarios(ArrayList listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
		
	}
	
	public GerenciadorUsuarios() {
	}
	
	public void addUsuario (Usuario u ) {
		listaUsuarios.add(u);
		
	}
	public void buscarUsuario () {
		
	}
	
	public void removerUsuario () {
		
	}
	
	public void login () {
		
	}
	
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public String toString() {
		return "GerenciadorUsuarios [listaUsuarios=" + listaUsuarios + "]";
	}
	
	
	
	
	}
	
