
package modelo;


public class Professor extends Usuario{
    private String departamento;
    
    public Professor (String departamento,String senha,String nome,String endereco,String email,String telefone,String nascimento,String cpf){
        super(senha,nome,endereco,email,telefone,nascimento,cpf);
        this.departamento = departamento;
        
    }
    
}
