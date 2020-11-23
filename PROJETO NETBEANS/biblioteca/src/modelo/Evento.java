
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Evento {
    
    // atributos
    
    private String descEvento;
    private String responsavel;
    private String hora;
    private String fone;
    private String publico;
    private String data;
    private String local;
    
    //construtores 
    
    public Evento(String descEvento, String responsavel, String hora, String fone, String publico, String data, String local) {
        this.descEvento = descEvento;
        this.responsavel = responsavel;
        this.hora = hora;
        this.fone = fone;
        this.publico = publico;
        this.data = data;
        this.local = local;
    }
    
    public Evento (){}
    
    //metodos
    
    public String toString() {
        return "Evento{" + "descEvento=" + descEvento + ", responsavel=" + responsavel + ", hora=" + hora + ", fone=" + fone + ", publico=" + publico + ", data=" + data + ", local=" + local + '}';
    }
   
    public String salvar(){
                         
        try {
            FileWriter editaArq = new FileWriter("evento.txt", true);     
            PrintWriter escreveArq = new PrintWriter(editaArq);

            escreveArq.println(this.descEvento);
            escreveArq.println(this.data);
            escreveArq.println(this.hora);
            escreveArq.println(this.local);
            escreveArq.println(this.publico);
            escreveArq.println(this.responsavel);
            escreveArq.println(this.fone); 
            escreveArq.flush();
            escreveArq.close();
            editaArq.close();

        } catch (IOException ex) {
            Logger.getLogger(Evento.class.getName()).log(Level.SEVERE, null, ex);         
        }
      
        return "Evento cadastrado com sucesso!";
       
    } 
    
    public String importar(String caminho){
        Path arquivo = Paths.get(caminho);
        try {
            byte[] texto = Files.readAllBytes(arquivo);
            String dadosExternos = new String(texto);
            FileWriter editaArq = new FileWriter("evento.txt", true);     
            PrintWriter escreveArq = new PrintWriter(editaArq);
            escreveArq.println(dadosExternos);
            escreveArq.flush();
            escreveArq.close();
            editaArq.close();
  
        } catch (IOException ex) {
            Logger.getLogger(Evento.class.getName()).log(Level.SEVERE, null, ex);
        }
  
         
        return "Importação realizada com sucesso!";
         
     }
    
    
    public String agenda() throws IOException{
        try {
            FileReader acessaArq = new FileReader("evento.txt");
            BufferedReader leiaArq = new BufferedReader(acessaArq);
            String linha = leiaArq.readLine();
            FileWriter agenda = new FileWriter("agenda.txt");
            PrintWriter relatorio = new PrintWriter(agenda);
                      
            relatorio.println("---------------------  MORAIS LIBRARY  --------------------");
            relatorio.println("--------------------- AGENDA DE EVENTOS--------------------\n");
            int cont = 0;
            while (linha != null){
                cont++;
                relatorio.println("Evento......: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("Data........: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("Hora........: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("Local.......: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("Publico.....: "+ linha+" pessoas");
                linha=leiaArq.readLine();
                relatorio.println("Responsável.: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("Fone........: "+ linha+"\n");
                linha=leiaArq.readLine();
                
            }
            relatorio.println(cont+" EVENTOS CADASTRADOS!");
            relatorio.flush();
            relatorio.close();
            agenda.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Evento.class.getName()).log(Level.SEVERE, null, ex);
            return "Não existe evento cadastrado!";
                       
        }
        return "Relatório gerado com sucesso!";
       
    }
    //acessadores e modificadores de atributos
    
    public String getDescEvento() {
        return descEvento;
    }

    public void setDescEvento(String descEvento) {
        this.descEvento = descEvento;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    } 

      
    
}
