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
	
	public Usuario login (String login,String senha) {
            for (int i = 0; i < listaUsuarios.size(); i++) {
		if (listaUsuarios.get(i).getLogin().equals(login) && listaUsuarios.get(i).getSenha().equals(senha)) {
                    return listaUsuarios.get(i);
		}
            }
            return null;
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
	
