package controle;
import modelo.Funcionario;
import java.util.ArrayList;

public class GerenciadorFuncionarios {
	private ArrayList<Funcionario>listaFuncionarios;
	
	
	public GerenciadorFuncionarios (ArrayList listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
	public GerenciadorFuncionarios () {
		
	}

	public ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

	
	public String toString() {
		return "GerenciadorFuncionarios [listaFuncionarios=" + listaFuncionarios + "]";
	}
	
	
	
	

}
