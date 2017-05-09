
public class ElementoInexistente extends Exception{
	public ElementoInexistente(String item){
		super(item + "não existe");
	}
}
