package trabalho;

public class Elemento {
	
	private ITAD tad;
	private Elemento proximo;
	private Elemento anterior;
	
	public ITAD getTad() {
		return tad;
	}
	public void setTad(ITAD tad) {
		this.tad = tad;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	public Elemento getAnterior() {
		return anterior;
	}
	public void setAnterior(Elemento anterior) {
		this.anterior = anterior;
	}
}


