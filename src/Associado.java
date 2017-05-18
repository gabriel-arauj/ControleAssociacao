import java.util.ArrayList;

public class Associado {
	
	private int numero;
	private String nome;
	private String endereco;
	private long nascimento;
	private long dataAssociacao;
	private int nivel;
	private String registaNivel;
	private String registroDePagamento;
	private ArrayList<Pagamentos> pagamentos;
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
	public long getNascimento() {
		return nascimento;
	}
	public void setNascimento(long nascimento) {
		this.nascimento = nascimento;
	}
	public long getDataAssociacao() {
		return dataAssociacao;
	}
	public void setDataAssociacao(long dataAssociacao) {
		this.dataAssociacao = dataAssociacao;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public String getRegistaNivel() {
		return registaNivel;
	}
	public void setRegistaNivel(String registaNivel) {
		this.registaNivel = registaNivel;
	}
	public String registroDePagamento() {
		return registroDePagamento;
	}
	public void registroDePagamento(String registaDePagamento) {
		this.registroDePagamento = registaDePagamento;
	}
	
	
	public ArrayList<Pagamentos> getPagamentos() {
		return pagamentos;
	}
	public void validacao() throws ValidacaoException{
		if(this.numero < 0){
			throw new ValidacaoException("Numero do associado");
		}else if(this.nome == null || this.nome == ""){
			throw new ValidacaoException("Nome do associado");
		}else if(this.endereco == null || this.endereco == ""){
			throw new ValidacaoException("Endereço do associado");
		}else if(this.nascimento < 0){
			throw new ValidacaoException("Nascimento do associado");
		}else if(this.dataAssociacao < 0){
			throw new ValidacaoException("Data de associação");
		}else if(this.nivel < 1  || this.nivel > 33){
			throw new ValidacaoException("Nivel do associado");
		}
	}
	
	public Pagamentos pesquisarPagamentos(String nomeTaxa, int ano) {
		for (Pagamentos a : pagamentos) {
			if (a.getTaxa() == nomeTaxa && a.getAno() == ano){
				return a;
			}
		}
		return null;
	}
	
	
	public Associado(int numero, String nome, String endereco, long nascimento, long dataAssociacao) {
		super();
		//caso o a data seja tipo data adicionar um campo
		this.numero = numero;
		this.nome = nome;
		this.endereco = endereco;
		this.nascimento = nascimento;
		this.dataAssociacao = dataAssociacao;
		this.nivel = 1;
		this.registaNivel = "";
		this.registroDePagamento = "";
		this.pagamentos = new ArrayList<Pagamentos>();
	}
	
}
