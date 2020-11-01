
package modelo;

import java.util.Date;

import modelo.Espaco;
        
public class Evento {
    
    // atributos
    
    private String descEvento, responsavel, hora, fone;
    private int publico;
    private Date data;
    private Espaco local;
    
    //construtores 
    
    public Evento(String descEvento, String responsavel, String hora, String fone, int publico, Date data, Espaco local) {
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
    
    public String cadastrarEvento(){
        return null;
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

    public int getPublico() {
        return publico;
    }

    public void setPublico(int publico) {
        this.publico = publico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Espaco getLocal() {
        return local;
    }

    public void setLocal(Espaco local) {
        this.local = local;
    } 
    
}
