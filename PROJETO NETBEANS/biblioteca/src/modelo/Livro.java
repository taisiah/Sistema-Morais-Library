
package modelo;

import java.util.ArrayList;

public class Livro {
    
    //atributos
    
    private String titulo, autor, editora;
    private int ano, edicao;
    private ArrayList<String> categoria = new ArrayList<String>();
    private ArrayList<String> tematica = new ArrayList<String>();

    //contrutores
    
    public Livro(String titulo, String autor, String editora, int ano, int edicao, ArrayList<String> categoria, ArrayList<String> tematica) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.categoria = categoria;
        this.tematica = tematica;
    }
    public Livro(){}
    
    //metodos
    
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", ano=" + ano + ", edicao=" + edicao + ", categoria=" + categoria + ", tematica=" + tematica + '}';
    }
            
    public String reservarLivro(){
        return null;
    }
    
    //acessadores e modificadores de atributos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public ArrayList<String> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<String> categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getTematica() {
        return tematica;
    }

    public void setTematica(ArrayList<String> tematica) {
        this.tematica = tematica;
    }
    
    
    
    
    
}
