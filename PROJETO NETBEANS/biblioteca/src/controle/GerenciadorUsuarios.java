package controle;

import java.util.ArrayList;
import modelo.Aluno;
import modelo.Funcionario;
import modelo.Professor;
import modelo.UserExterno;
import modelo.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GerenciadorUsuarios {

    private static GerenciadorUsuarios uniqueInstance;
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Professor> listaProfessores;
    private ArrayList<Funcionario> listaFuncionarios;
    private ArrayList<UserExterno> listaUserExternos;

    private GerenciadorUsuarios() {
        this.listaAlunos = new ArrayList<Aluno>();
        this.listaProfessores = new ArrayList<Professor>();
        this.listaFuncionarios = new ArrayList<Funcionario>();
        this.listaUserExternos = new ArrayList<UserExterno>();
        //abrir arquivo
        //ler todos os dados do arquivo e adicionar os objetos nos arraylists
        //fechar arquivo
    }

    public static GerenciadorUsuarios getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new GerenciadorUsuarios();
        }
        return uniqueInstance;
    }

    public boolean addUsuario(Usuario u) {
        //abrir arquivo usuarios.txt
        if (u instanceof Aluno) {
            for (int i = 0; i < listaAlunos.size(); i++) {
                if (listaAlunos.get(i).getEmail().equals(u.getEmail())) {
                    return false;
                }
            }
            listaAlunos.add((Aluno) u);
            try {
                FileWriter editaArq = new FileWriter("usu_alunos.txt", false);
                PrintWriter escreveArq = new PrintWriter(editaArq);
                for (int i = 0; i < listaAlunos.size(); i++) {
                    escreveArq.println(listaAlunos.get(i).getEmail());
                    escreveArq.println(listaAlunos.get(i).getCurso());
                    escreveArq.println(listaAlunos.get(i).getMatricula());
                    escreveArq.println(listaAlunos.get(i).getCpf());
                    escreveArq.println(listaAlunos.get(i).getEndereco());
                    escreveArq.println(listaAlunos.get(i).getNascimento());
                    escreveArq.println(listaAlunos.get(i).getNome());
                    escreveArq.println(listaAlunos.get(i).getSenha());
                    escreveArq.println(listaAlunos.get(i).getTelefone());
                    
                    

                    
                }
                editaArq.flush();
                editaArq.close();
                escreveArq.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            //escrever no arquivo usuarios.txt
            //Aluno curso matricula senha nome endereco email telefone nascimento cpf
            //fecha arquivo
            return true;
        } else if (u instanceof Professor) {
            for (int i = 0; i < listaProfessores.size(); i++) {
                if (listaProfessores.get(i).getEmail().equals(u.getEmail())) {
                    return false;
                }
            }
            listaProfessores.add((Professor) u);
             try {
                FileWriter editaArq = new FileWriter("usu_professores.txt", false);
                PrintWriter escreveArq = new PrintWriter(editaArq);
                for (int i = 0; i < listaProfessores.size(); i++) {
                    escreveArq.println(listaProfessores.get(i).getEmail());
                    escreveArq.println(listaProfessores.get(i).getDepartamento());
                    escreveArq.println(listaProfessores.get(i).getCpf());
                    escreveArq.println(listaProfessores.get(i).getEndereco());
                    escreveArq.println(listaProfessores.get(i).getNascimento());
                    escreveArq.println(listaProfessores.get(i).getNome());
                    escreveArq.println(listaProfessores.get(i).getSenha());
                    escreveArq.println(listaProfessores.get(i).getTelefone());
                    
                    
                }
                editaArq.flush();
                editaArq.close();
                escreveArq.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            return true;

        } else if (u instanceof UserExterno) {
            for (int i = 0; i < listaUserExternos.size(); i++) {
                if (listaUserExternos.get(i).getEmail().equals(u.getEmail())) {
                    return false;
                }
            }
            listaUserExternos.add((UserExterno) u);
             try {
                FileWriter editaArq = new FileWriter("usu_externos.txt", false);
                PrintWriter escreveArq = new PrintWriter(editaArq);
                for (int i = 0; i < listaUserExternos.size(); i++) {
                    escreveArq.println(listaUserExternos.get(i).getEmail());
                    escreveArq.println(listaUserExternos.get(i).getMensalidade());
                    escreveArq.println(listaUserExternos.get(i).getCpf());
                    escreveArq.println(listaUserExternos.get(i).getEndereco());
                    escreveArq.println(listaUserExternos.get(i).getNascimento());
                    escreveArq.println(listaUserExternos.get(i).getNome());
                    escreveArq.println(listaUserExternos.get(i).getSenha());
                    escreveArq.println(listaUserExternos.get(i).getTelefone());
                    
                    
                }
                editaArq.flush();
                editaArq.close();
                escreveArq.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            return true;
        } else if (u instanceof Funcionario) {
            for (int i = 0; i < listaFuncionarios.size(); i++) {
                if (listaFuncionarios.get(i).getEmail().equals(u.getEmail())) {
                    return false;
                }
            }
            listaFuncionarios.add((Funcionario) u);
             try {
                FileWriter editaArq = new FileWriter("usu_funcionarios.txt", false);
                PrintWriter escreveArq = new PrintWriter(editaArq);
                for (int i = 0; i < listaFuncionarios.size(); i++) {
                    escreveArq.println(listaFuncionarios.get(i).getEmail());
                    escreveArq.println(listaFuncionarios.get(i).getCargo());
                    escreveArq.println(listaFuncionarios.get(i).getCpf());
                    escreveArq.println(listaFuncionarios.get(i).getEndereco());
                    escreveArq.println(listaFuncionarios.get(i).getNascimento());
                    escreveArq.println(listaFuncionarios.get(i).getNome());
                    escreveArq.println(listaFuncionarios.get(i).getSenha());
                    escreveArq.println(listaFuncionarios.get(i).getTelefone());
                    
                    
                }
                editaArq.flush();
                editaArq.close();
                escreveArq.close();
            } catch (IOException ex) {
                 System.out.println(ex.getMessage());  
            }

            return true;
        }
        //fecha arquivo
        return false;
    }

    public Usuario buscarUsuario(String email) {

        for (int i = 0; i < listaProfessores.size(); i++) {
            if (listaProfessores.get(i).getEmail().equals(email)) {
                return listaProfessores.get(i);
            }
        }
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getEmail().equals(email)) {
                return listaAlunos.get(i);
            }
        }
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            if (listaFuncionarios.get(i).getEmail().equals(email)) {
                return listaFuncionarios.get(i);
            }
        }
        for (int i = 0; i < listaUserExternos.size(); i++) {
            if (listaUserExternos.get(i).getEmail().equals(email)) {
                return listaUserExternos.get(i);
            }
        }

        return null;
    }

    public boolean removerUsuario(String email) {

        for (int i = 0; i < listaProfessores.size(); i++) {
            if (listaProfessores.get(i).getEmail().equals(email)) {
                listaProfessores.remove(i);
                return true;
            }
        }
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getEmail().equals(email)) {
                listaAlunos.remove(i);
                return true;
            }
        }
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            if (listaFuncionarios.get(i).getEmail().equals(email)) {
                listaFuncionarios.remove(i);
                return true;
            }
        }
        for (int i = 0; i < listaUserExternos.size(); i++) {
            if (listaUserExternos.get(i).getEmail().equals(email)) {
                listaUserExternos.remove(i);
                return true;
            }
        }
        return false;

    }

    public Usuario login(String login, String senha) {

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
