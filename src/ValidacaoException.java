
public class ValidacaoException extends Exception{
	public ValidacaoException(String item){
		super(item + "invalido");
	}
}
