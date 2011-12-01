package miniProva;

public abstract class Processamento {
	
	private String palavra;
	
	public Processamento(String p){
		this.palavra = p;
	}
	
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	public abstract void processar(String palavra);
	
	public static void main(String[] args) {

	}

}