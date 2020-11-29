
package controle;
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
import modelo.Livro;


public class GerenciadorLivros {
    
    private static GerenciadorLivros uniqueInstance;
    private ArrayList<Livro> listaLivros;


    private GerenciadorLivros () {
        this.listaLivros = new ArrayList<Livro>();

    }


    public static GerenciadorLivros getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new GerenciadorLivros();
        }
            return uniqueInstance;
    }

    public String adicionarLivro(Livro liv){ 

        try {
            FileWriter editaArq = new FileWriter("livro.txt", true);
            PrintWriter escreveArq = new PrintWriter(editaArq); 
            escreveArq.println(liv.getTitulo());
            escreveArq.println(liv.getAutor());
            escreveArq.println(liv.getEditora());
            escreveArq.println(liv.getCidade());
            escreveArq.println(liv.getUf());
            escreveArq.println(liv.getAno());
            escreveArq.println(liv.getEdicao());
            escreveArq.println(liv.getIsbn());
            escreveArq.println(liv.getCategoria());
            escreveArq.println(liv.getTematica());
            escreveArq.println(liv.isDisponivel());
            editaArq.flush();
            editaArq.close();
            escreveArq.close();
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorEspacos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ("Livro cadastrado com sucesso!");
    }

    public Livro buscarLivro(String titLivro){

        this.listaLivros.clear();

        try {
            Livro liv1;
            FileReader acessaArq = new FileReader("livro.txt");
            BufferedReader leiaArq = new BufferedReader(acessaArq);
            String lnTitulo = leiaArq.readLine();        
            String lnAutor;
            String lnEditora;
            String lnCidade;
            String lnUF;
            int lnAno;
            int lnEdicao;
            String lnIsbn;
            String lnCategoria;  
            String lnTematica;
            boolean lnDisponivel;

            while (lnTitulo != null){

                lnAutor = leiaArq.readLine();
                lnEditora = leiaArq.readLine();
                lnCidade = leiaArq.readLine();
                lnUF = leiaArq.readLine();
                lnAno = Integer.parseInt(leiaArq.readLine());
                lnEdicao = Integer.parseInt(leiaArq.readLine());
                lnIsbn = leiaArq.readLine();
                lnCategoria = leiaArq.readLine(); 
                lnTematica = leiaArq.readLine();
                lnDisponivel = Boolean.parseBoolean(leiaArq.readLine()); 
                
                liv1 = new Livro(lnTitulo,lnAutor,lnEditora,lnCidade,lnUF,lnAno,lnEdicao,lnIsbn,lnCategoria,lnTematica,lnDisponivel);  
                this.listaLivros.add(liv1);

                lnTitulo = leiaArq.readLine();

                }
            acessaArq.close();
            leiaArq.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GerenciadorEspacos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorEspacos.class.getName()).log(Level.SEVERE, null, ex);
        }           

        for (int i = 0; i < this.listaLivros.size(); i++){
            if (this.listaLivros.get(i).getTitulo().equals(titLivro)){
                return this.listaLivros.get(i);                      
            }
        }
        return null;
    }
    
    
    
    public boolean removerLivro(String titLivro){
        
        boolean result=false;
        File file = new File("livro.txt");
                               
        for (int i = 0; i < this.listaLivros.size(); i++){
            
            if (this.listaLivros.get(i).getTitulo().equals(titLivro)){
                this.listaLivros.remove(i);
                System.out.println(listaLivros);
                file.delete();
                result = true;
                break;
            }        
        }
        
        if (!listaLivros.isEmpty()){  
        
            for (int j = 0; j < this.listaLivros.size(); j++){

                try {
                    FileWriter editaArq = new FileWriter("livro.txt",true);
                    PrintWriter escreveArq = new PrintWriter(editaArq); 
                    escreveArq.println(this.listaLivros.get(j).getTitulo());
                    escreveArq.println(this.listaLivros.get(j).getAutor());
                    escreveArq.println(this.listaLivros.get(j).getEditora());
                    escreveArq.println(this.listaLivros.get(j).getCidade());
                    escreveArq.println(this.listaLivros.get(j).getUf());
                    escreveArq.println(this.listaLivros.get(j).getAno());
                    escreveArq.println(this.listaLivros.get(j).getEdicao());
                    escreveArq.println(this.listaLivros.get(j).getIsbn());
                    escreveArq.println(this.listaLivros.get(j).getCategoria());
                    escreveArq.println(this.listaLivros.get(j).getTematica());
                    escreveArq.println(this.listaLivros.get(j).isDisponivel());
                    editaArq.flush();
                    editaArq.close();
                    escreveArq.close();
                } catch (IOException ex) {
                    Logger.getLogger(GerenciadorLivros.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         }else{
            if (listaLivros.isEmpty()&& result){
                return result;
            }
        }  
        return result; 
     
    
    }
    
    
    
}
               
