/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *

 */
public class ReservaEspaco {
    private Usuario usuario;
    private Espaco espaco;
    private String data ;
    private String hora;
    
    public ReservaEspaco (Usuario usuario,Espaco espaco,String data,String hora){
        this.usuario = usuario;
        this.espaco=espaco;
        this.data = data ;
        this.hora = hora;       
    }
    
    public ReservaEspaco(){
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    
    public String toString() {
        return "ReservaEspaco{" + "usuario=" + usuario + ", espaco=" + espaco + ", data=" + data + ", hora=" + hora + '}';
    }

 
    
}
