import java.util.ArrayList;

public class ControleAssociacao {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

	private ArrayList<Associacao> associacoes = new ArrayList<Associacao>();
	
	/* 1.
	 * Método para criar uma associação, verificando todo o correto preenchimento
	 * dos dados necessários e verificando se já não existe uma outra associação 
	 * com o mesmo número. 
	 * */
	public void criarAssociacao(Associacao assoc) throws ValidacaoException, ElementoJaExistente{
		assoc.validacao();
		try {
			 pesquisarAssociacao(assoc.getNumero());
			 throw new ElementoJaExistente("Associação");
		   } catch (ElementoInexistente e) {
			 associacoes.add(assoc);
		   }
	}
	
	/* 2.
	 * Método para adicionar um associado a uma associação, verificando o correto 
	 * preenchimento dos campos exigidos e se o associado já não existe cadastrado 
	 * na associação.
	 * */
	public void addAssociado(int assoc, Associado a) 
			throws ValidacaoException, ElementoInexistente, ElementoJaExistente{
		a.validacao();
		Associacao ass = pesquisarAssociacao(assoc);
		try{
			ass.pesquisarAssociado(a.getNumero());
			throw new ElementoJaExistente("Associado");
		}catch(ElementoInexistente e){
			ass.getAssociados().add(a);
		}
	}
	
	/* 3.
	 * Esse método deve salvar uma taxa associada à associação. Cada taxa tem um
	 * nome, um ano de vigência, um valor anual e uma quantidade de parcelas. Não 
	 * se pode salvar taxas com mesmo nome para uma associação, com uma mesma vigência. 
	 * */
	public void criarTaxa(int assoc, Taxa t) 
			throws ValidacaoException, ElementoJaExistente, ElementoInexistente{
		t.validacao();
		Associacao ass = pesquisarAssociacao(assoc);
		try{
			ass.pesquisarTaxa(t.getNome(), t.getAnoDeVigencia());
			throw new ElementoJaExistente("Taxa");
		}catch(ElementoInexistente e){
			ass.getTaxas().add(t);
		}
	}
	
	/* 4.
	 * Esse método deve registrar a mudança de nível de um associado. Deve-se verificar 
	 * se o novo nível é compatível com o seu nível atual (se é o próximo e menor que o máximo). 
	 * Deve-se registrar essa mudança de forma a se ter um histórico de mudanças. 
	 * */
	public void mudarNivel(int assoc, int numAssociado, int novoNivel, long data) 
			throws ValidacaoException, ElementoInexistente{
		Associacao ass = pesquisarAssociacao(assoc);
		Associado a = ass.pesquisarAssociado(numAssociado);
		if(a.getNivel() + 1 != novoNivel && novoNivel >33){
			throw new ValidacaoException("Novo nivel");
		}else if(data < a.getDataAssociacao()){
			throw new ValidacaoException("Data do nivel");
		}else{
			a.setRegistaNivel(a.getRegistaNivel() + "Nivel anterior:" + a.getNivel() + " - Nivel Atual: " + novoNivel + ". Data: " + data);
			a.setNivel(novoNivel);
		}
	}
	
	/* 5.
	 * Esse método deve registrar o pagamento de uma taxa, para um associado, em um mês, com um 
	 * determinado valor. Deve-se verificar se o associado existe, se a taxa existe, se a vigência 
	 * dela está compatível com o ano informado, se o pagamento é maior ou igual ao valor de uma parcela 
	 * e se o valor é menor ou igual ao que ainda é devido pelo associado. 
	 */
	public void registrarPagamento(int assoc, String nomeTaxa, int associado, int mes, int ano, double valor) 
			throws ValidacaoException, ElementoInexistente {
		Associacao ass = pesquisarAssociacao(assoc);
		Associado a = ass.pesquisarAssociado(associado);
		Taxa taxa = ass.pesquisarTaxa(nomeTaxa, ano);
		if(valor < taxa.valorMensal()){
			throw new ValidacaoException("Valor de pagamento");
		}
	}
	
	/* 6.
	 * Esse método deve retornar o valor total de pagamentos feitos por um associado em um determinado ano, 
	 * para uma determinada taxa. 
	 * */
	public double somarPagamentoDeAssociado (int associação, int numeroAssociado, String taxa, int ano) 
			throws ElementoInexistente{
		return 1;
	}
	
	public Associacao pesquisarAssociacao(int cod) throws ElementoInexistente {
		for (Associacao a : associacoes) {
			if (a.getNumero() == cod){
				return a;
			}
		}
		throw new ElementoInexistente("Associação");
	}
}
