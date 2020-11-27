
package controle;

import java.util.ArrayList;
import modelo.Evento;

public class GerenciadorEventos {

    
    private static GerenciadorEventos uniqueInstance;
    private ArrayList<Evento> listaEventos;
       
    
    private GerenciadorEventos() {
        this.listaEventos = new ArrayList<Evento>() ;
    }
    
    
    public static GerenciadorEventos getInstance() {
            if(uniqueInstance == null) {
                uniqueInstance = new GerenciadorEventos();
            }
            return uniqueInstance;
        }
    
    
    public String adicionarEvento(Evento e){

        listaEventos.add(e);
        return null;
    }
       
        
    public Evento buscarEvento(String descEvt){
            
        for (int i = 0; i < listaEventos.size(); i++){
            if (listaEventos.get(i).getDescEvento().equals(descEvt)){
                return listaEventos.get(i);            
            }
        }
        return null;
    }
    
    public boolean removerEvento (String descEvt) {
            
        for (int i = 0; i < listaEventos.size(); i++){
            if (listaEventos.get(i).getDescEvento().equals(descEvt)){
                listaEventos.remove(i);
                return true;
            }
        }
        return false;   
    }

    public static GerenciadorEventos getUniqueInstance() {
        return uniqueInstance;
    }

    public static void setUniqueInstance(GerenciadorEventos uniqueInstance) {
        GerenciadorEventos.uniqueInstance = uniqueInstance;
    }

    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }
    
    
    
    
}
