package controle;
import java.util.ArrayList;
import modelo.Aluno;
import modelo.Funcionario;
import modelo.Professor;
import modelo.UserExterno;

import modelo.Usuario;

public class GerenciadorUsuarios {
	
        private static GerenciadorUsuarios uniqueInstance;
        private ArrayList<Aluno> listaAlunos;
        private ArrayList<Professor> listaProfessores;
        private ArrayList<Funcionario> listaFuncionarios;
        private ArrayList<UserExterno> listaUserExternos;
	
	
	private GerenciadorUsuarios() {
            this.listaAlunos = new ArrayList<Aluno> ();
            this.listaProfessores = new ArrayList<Professor> ();
            this.listaFuncionarios = new ArrayList<Funcionario> ();
            this.listaUserExternos = new ArrayList<UserExterno> ();
	}
        
        public static GerenciadorUsuarios getInstance() {
            if(uniqueInstance == null) {
                uniqueInstance = new GerenciadorUsuarios();
            }
            return uniqueInstance;
        }
	
	public boolean addUsuario (Usuario u ) {
            
            if(u instanceof Aluno){
                for (int i = 0; i < listaAlunos.size(); i++) {
                    if (listaAlunos.get(i).getEmail().equals(u.getEmail())){
                        return false;
                    }
                }
                listaAlunos.add((Aluno) u);
                return true;
            }
                
            else if(u instanceof Professor){
                for (int i = 0; i < listaProfessores.size(); i++) {
                    if (listaProfessores.get(i).getEmail().equals(u.getEmail())){
                        return false;
                    }
                }
                listaProfessores.add((Professor) u);
                return true;
                
            }
            
            else if (u instanceof UserExterno){
                for (int i = 0; i < listaUserExternos.size(); i++) {
                    if (listaUserExternos.get(i).getEmail().equals(u.getEmail())){
                        return false;
                    }
                }
                listaUserExternos.add((UserExterno) u);
                return true;
            }
            else if (u instanceof Funcionario){
                for (int i = 0; i < listaFuncionarios.size(); i++) {
                    if (listaFuncionarios.get(i).getEmail().equals(u.getEmail())){
                        return false;
                    }
                }
                listaFuncionarios.add((Funcionario) u);
                return true;
            }      
            return false;
        }    
        
  
		
	
	/*public Usuario buscarUsuario () {
		
	}
	
	public void removerUsuario () {
		
	}
	*/
        
	public Usuario login (String login,String senha) {
            
            for (int i = 0; i < listaAlunos.size(); i++) {
		if (listaAlunos.get(i).getEmail().equals(login) && listaAlunos.get(i).getSenha().equals(senha)) {
                    return listaAlunos.get(i);
		}
            }
            
            for (int i = 0; i < listaProfessores.size(); i++) {
		if (listaProfessores.get(i).getEmail().equals(login) && listaProfessores.get(i).getSenha().equals(senha)) {
                    return listaProfessores.get(i);
		}
            }
            
            for (int i = 0; i < listaFuncionarios.size(); i++) {
		if (listaFuncionarios.get(i).getEmail().equals(login) && listaFuncionarios.get(i).getSenha().equals(senha)) {
                    return listaFuncionarios.get(i);
		}
            }
            
            for (int i = 0; i < listaUserExternos.size(); i++) {
		if (listaUserExternos.get(i).getEmail().equals(login) && listaUserExternos.get(i).getSenha().equals(senha)) {
                    return listaUserExternos.get(i);
		}
            }
            
            return null;
	}
}
	
