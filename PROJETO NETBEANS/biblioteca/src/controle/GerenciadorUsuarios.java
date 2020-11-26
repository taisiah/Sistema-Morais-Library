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
            //abrir arquivo
            //ler todos os dados do arquivo e adicionar os objetos nos arraylists
            //fechar arquivo
	}
        
        public static GerenciadorUsuarios getInstance() {
            if(uniqueInstance == null) {
                uniqueInstance = new GerenciadorUsuarios();
            }
            return uniqueInstance;
        }
	
	public boolean addUsuario (Usuario u) {
            //abrir arquivo usuarios.txt
            if(u instanceof Aluno){
                for (int i = 0; i < listaAlunos.size(); i++) {
                    if (listaAlunos.get(i).getEmail().equals(u.getEmail())){
                        return false;
                    }
                }
                listaAlunos.add((Aluno) u);
                //escrever no arquivo usuarios.txt
                //Aluno curso matricula senha nome endereco email telefone nascimento cpf
                //fecha arquivo
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
            //fecha arquivo
            return false;
        }    
        
		
	
	public Usuario buscarUsuario (String email) {
            
            for (int i = 0; i < listaProfessores.size(); i++){
                if (listaProfessores.get(i).getEmail().equals(email)){
                    return listaProfessores.get(i);
                }
            }
            for (int i = 0; i < listaAlunos.size(); i++){
                if (listaAlunos.get(i).getEmail().equals(email)){
                    return listaAlunos.get(i);
                }
            }
            for (int i = 0; i < listaFuncionarios.size(); i++){
                if (listaFuncionarios.get(i).getEmail().equals(email)){
                    return listaFuncionarios.get(i);
                }
            }
            for (int i = 0; i < listaUserExternos.size(); i++){
                if (listaUserExternos.get(i).getEmail().equals(email)){
                    return listaUserExternos.get(i);
                }
            }
            
            return null;
	}
	
	public boolean removerUsuario (String email) {
            
            for (int i = 0; i < listaProfessores.size(); i++){
                if (listaProfessores.get(i).getEmail().equals(email)){
                    listaProfessores.remove(i);
                    return true;
                }
            }
            for (int i = 0; i < listaAlunos.size(); i++){
                if (listaAlunos.get(i).getEmail().equals(email)){
                    listaAlunos.remove(i);
                    return true;
                }
            }
            for (int i = 0; i < listaFuncionarios.size(); i++){
                if (listaFuncionarios.get(i).getEmail().equals(email)){
                    listaFuncionarios.remove(i);
                    return true;
                }
            }
            for (int i = 0; i < listaUserExternos.size(); i++){
                if (listaUserExternos.get(i).getEmail().equals(email)){
                    listaUserExternos.remove(i);
                    return true;
                }
            }
            return false;
            
        }
        
  
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
	
