package excecoes;

import miniProva.Processamento;

public  class ProcessamentoException extends Exception {
	
	private String palavraProcessada;
	
	public ProcessamentoException() {
		super("processamento exception!");
	}
	
	public ProcessamentoException(String palavraProcessada) {
		super("processamento exception!");
		this.palavraProcessada =  palavraProcessada;
	}
	

	public String getPalavraProcessada() {
		return palavraProcessada;
	}

	public void setPalavraProcessada(String palavraProcessada) {
		this.palavraProcessada = palavraProcessada;
	}
	
}
