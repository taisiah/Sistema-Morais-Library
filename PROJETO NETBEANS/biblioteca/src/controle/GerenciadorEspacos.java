
package controle;

import java.util.ArrayList;
import modelo.Espaco;

public class GerenciadorEspacos {

    
    private static GerenciadorEspacos uniqueInstance;
    private ArrayList<Espaco> listaEspacos;
       
    
    private GerenciadorEspacos() {
        this.listaEspacos = new ArrayList<>();
    }
    
    
    public static GerenciadorEspacos getInstance() {
            if(uniqueInstance == null) {
                uniqueInstance = new GerenciadorEspacos();
            }
            return uniqueInstance;
        }
    
    
    public String adicionarEspaco(Espaco e){

        listaEspacos.add(e);
        return null;
    }
       
        
    public Espaco buscarEspaco(String descEsp){
            
        for (int i = 0; i < listaEspacos.size(); i++){
            if (listaEspacos.get(i).getDescEspaco().equals(descEsp)){
                return listaEspacos.get(i);                      
            }
        }
        return null;
    }
    
    
    public boolean removerEspaco (String descEsp) {
            
        for (int i = 0; i < listaEspacos.size(); i++){
            if (listaEspacos.get(i).getDescEspaco().equals(descEsp)){
                listaEspacos.remove(i);
                return true;
            }
        }
        return false;   
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
