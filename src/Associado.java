
public class Associado {
	
	private int numero;
	private String nome;
	private String endereco;
	private long nascimento;
	private long dataAssociacao;
	private int nivel;
	private String registaNivel;
	private String registaDePagamento;
	/**criar uma classe pagamento*/
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
	public String getRegistaDePagamento() {
		return registaDePagamento;
	}
	public void setRegistaDePagamento(String registaDePagamento) {
		this.registaDePagamento = registaDePagamento;
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
	
	
}
