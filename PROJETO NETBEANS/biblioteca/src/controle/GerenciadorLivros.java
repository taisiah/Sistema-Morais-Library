/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import java.util.ArrayList;
import modelo.Livro;


public class GerenciadorLivros {
    
        private static GerenciadorLivros uniqueInstance;
        private ArrayList<Livro> listalivros;
  

        private GerenciadorLivros () {
            this.listalivros =listalivros;
    
        }
    
    
        public static GerenciadorLivros getInstance() {
            if(uniqueInstance == null) {
                uniqueInstance = new GerenciadorLivros();
            }
                return uniqueInstance;
        }
        
        
}
