
public class ElementoJaExistente extends Exception{
	public ElementoJaExistente(String item){
		super(item + "Já existe");
	}
}
