

public class Pagamentos {
	private String taxa;
	private int ano;
	private float pago;
	private int mes;
	
	public String getTaxa() {
		return taxa;
	}

	public int getAno() {
		return ano;
	}

	public float getPago() {
		return pago;
	}

	public int getMes() {
		return mes;
	}
	
	public void pagarTaxa(String taxa, float valor) throws ElementoInexistente{
		if(this.taxa == taxa){
			pago += valor;
			this.mes ++;
		}else{
			throw new ElementoInexistente("taxa a pagar não exite");
		}
	}
	
	
	public Pagamentos(String taxa, int ano) {
		this.taxa = taxa;
		this.pago = 0;
		this.mes = 0;
		this.ano = ano;
		
	}
	
	
}
