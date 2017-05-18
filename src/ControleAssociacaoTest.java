import static org.junit.Assert.*;

import org.junit.Test;

public class ControleAssociacaoTest {

	@Test
	public void testCriarAssociacao() throws ElementoInexistente {
		ControleAssociacao controle = new ControleAssociacao();
		Associacao assoc  = new Associacao(1, "FSociety", "parque abandonado");
	
	Associado a1 = new Associado(1, "gabriel", "zzz", 1111, 888);
	Associado a2 = new Associado(2, "bilu", "quadra 142", 1111, 888);
	Associado a3 = new Associado(3, "picapau", "quadra 142", 1111, 888);
	try {
		controle.criarAssociacao(assoc);
	} catch (ValidacaoException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ElementoJaExistente e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		controle.addAssociado(1, a1);
		controle.addAssociado(1, a2);
		controle.addAssociado(1, a3);
		controle.addAssociado(1, a3);
	} catch (ValidacaoException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ElementoInexistente e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ElementoJaExistente e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(controle.pesquisarAssociacao(1).pesquisarAssociado(2).getNome());
	//assertEquals(a1, );
	
	}
	
	
	
}
