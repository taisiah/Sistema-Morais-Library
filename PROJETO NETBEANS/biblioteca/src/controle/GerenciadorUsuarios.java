package controle;
import java.util.ArrayList;

import modelo.Usuario;

public class GerenciadorUsuarios {
	
        private static GerenciadorUsuarios uniqueInstance;
	private ArrayList<Usuario> listaUsuarios ;
	
	private GerenciadorUsuarios(ArrayList listaUsuarios) {
		this.listaUsuarios = listaUsuarios;	
	}
	
	private GerenciadorUsuarios() {
            this.listaUsuarios = new ArrayList<Usuario> ();
	}
        
        public static GerenciadorUsuarios getInstance() {
            if(uniqueInstance == null) {
                uniqueInstance = new GerenciadorUsuarios();
            }
            return uniqueInstance;
        }
	
	public boolean addUsuario (Usuario u ) {
            for (int i = 0; i < listaUsuarios.size(); i++) {
		if (listaUsuarios.get(i).getEmail().equals(u.getEmail())){
                    return false;
                }    
            }
            listaUsuarios.add(u);
            return true;
        }    
        
  
		
	
	/*public Usuario buscarUsuario () {
		
	}
	
	public void removerUsuario () {
		
	}
	*/
        
	public Usuario login (String login,String senha) {
            for (int i = 0; i < listaUsuarios.size(); i++) {
		if (listaUsuarios.get(i).getEmail().equals(login) && listaUsuarios.get(i).getSenha().equals(senha)) {
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
	
