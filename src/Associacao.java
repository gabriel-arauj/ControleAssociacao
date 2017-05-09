import java.util.ArrayList;

public class Associacao {

	private int numero;
	private String nome;
	private String endereco;
	
	private ArrayList<Associado> associados = new ArrayList<Associado>();
	private ArrayList<Taxa> taxas = new ArrayList<Taxa>();

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Associado> getAssociados() {
		return associados;
	}

	public ArrayList<Taxa> getTaxas() {
		return taxas;
	}


	public void validacao() throws ValidacaoException{
		if(this.numero < 0){
			throw new ValidacaoException("Numero da associação");
		}else if(this.nome == null || this.nome == ""){
			throw new ValidacaoException("Nome da associação");
		}else if(this.endereco == null || this.endereco == ""){
			throw new ValidacaoException("Endereço da associação");
		}
	}
	
	public Associado pesquisarAssociado(int cod) throws ElementoInexistente {
		for (Associado a : associados) {
			if (a.getNumero() == cod){
				return a;
			}
		}
		throw new ElementoInexistente("Associado");
	}
	
	public Taxa pesquisarTaxa(String nome, int ano) throws ElementoInexistente {
		for (Taxa a : taxas) {
			if (a.getNome() == nome && a.getAnoDeVigencia() == ano){
				return a;
			}
		}
		throw new ElementoInexistente("Taxa");
	}
}
