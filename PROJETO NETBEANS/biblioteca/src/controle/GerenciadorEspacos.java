
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
import modelo.Espaco;

public class GerenciadorEspacos {

    
    private static GerenciadorEspacos uniqueInstance;
    private ArrayList<Espaco> listaEspacos;
       
    
    private GerenciadorEspacos() {
        this.listaEspacos = new ArrayList<Espaco>();
    }
    
    
    public static GerenciadorEspacos getInstance() {
            if(uniqueInstance == null) {
                uniqueInstance = new GerenciadorEspacos();
            }
            return uniqueInstance;
        }
    
    
    public String adicionarEspaco(Espaco e1){ 
 
        try {
            FileWriter editaArq = new FileWriter("espaco.txt", true);
            PrintWriter escreveArq = new PrintWriter(editaArq); 
            escreveArq.println(e1.getDescEspaco());
            escreveArq.println(e1.getCapacidade());
            escreveArq.println(e1.isDisponivel());
            editaArq.flush();
            editaArq.close();
            escreveArq.close();
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorEspacos.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        return null;
    }
      
        
    public Espaco buscarEspaco(String descEsp){        
        
        this.listaEspacos.clear();
                                 
        try {
            Espaco e;
            FileReader acessaArq = new FileReader("espaco.txt");
            BufferedReader leiaArq = new BufferedReader(acessaArq);
            String linhaDesc = leiaArq.readLine();
            String linhaCap;
            boolean linhaDisp;
            
            while (linhaDesc != null){
                
                linhaCap = leiaArq.readLine();
                linhaDisp = Boolean.getBoolean(leiaArq.readLine());              
                e = new Espaco(linhaDesc,linhaCap,linhaDisp);      
                this.listaEspacos.add(e);
                linhaDesc = leiaArq.readLine();
                
                }
            acessaArq.close();
            leiaArq.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GerenciadorEspacos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorEspacos.class.getName()).log(Level.SEVERE, null, ex);
        }           
            
        for (int i = 0; i < this.listaEspacos.size(); i++){
            if (this.listaEspacos.get(i).getDescEspaco().equals(descEsp)){
                return this.listaEspacos.get(i);                      
            }
        }
        return null;
    }
    
    
    public boolean removerEspaco (String descEsp){
                
        boolean result=false;
                               
        for (int i = 0; i < this.listaEspacos.size(); i++){
            
            if (this.listaEspacos.get(i).getDescEspaco().equals(descEsp)){
                this.listaEspacos.remove(i);
                System.out.println(listaEspacos);
                result = true;

                break;
            }        
        }
        
        if (listaEspacos.isEmpty()){  
            File file = new File("espaco.txt");
            file.delete();
                    
        }else{          
           
            for (int j = 0; j < this.listaEspacos.size(); j++){

                try {
                    FileWriter editaArq = new FileWriter("espaco.txt",true);
                    PrintWriter escreveArq = new PrintWriter(editaArq); 
                    escreveArq.println(this.listaEspacos.get(j).getDescEspaco());
                    escreveArq.println(this.listaEspacos.get(j).getCapacidade());
                    escreveArq.println(this.listaEspacos.get(j).isDisponivel());
                    editaArq.flush();
                    editaArq.close();
                    escreveArq.close();
                } catch (IOException ex) {
                    Logger.getLogger(GerenciadorEspacos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return result;
             
        }
        return result; 
        
    }
    

    
    public static GerenciadorEspacos getUniqueInstance() {
        return uniqueInstance;
    }

    public static void setUniqueInstance(GerenciadorEspacos uniqueInstance) {
        GerenciadorEspacos.uniqueInstance = uniqueInstance;
    }

    public ArrayList<Espaco> getListaEspacos() {
        return listaEspacos;
    }

    public void setListaEspacos(ArrayList<Espaco> listaEspacos) {
        this.listaEspacos = listaEspacos;
    }
    
    
    
}
