
package modelo;


public class Espaco {
    
    //atributos
    
    private String descEspaco, obs;
    private boolean disponivel;
    private int capacidade;
    
    //construtores
    
    public Espaco(String descEspaco, String obs, boolean disponivel, int capacidade) {
        this.descEspaco = descEspaco;
        this.obs = obs;
        this.disponivel = disponivel;
        this.capacidade = capacidade;
    }
    
    public Espaco() {}
    
    //metodos
    
    public String toString() {
        return "Espaco{" + "descEspaco=" + descEspaco + ", obs=" + obs + ", disponivel=" + disponivel + ", capacidade=" + capacidade + '}';
    }
    
    public String cadastrarEspaco(){
        return null;
    }
       
    //acessadores e modificadores de atributos
    
    public String getDescEspaco() {
        return descEspaco;
    }

    public void setDescEspaco(String descEspaco) {
        this.descEspaco = descEspaco;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
    
    
    
    
    
}
