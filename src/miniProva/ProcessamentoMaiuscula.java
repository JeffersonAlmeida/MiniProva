package miniProva;


public class ProcessamentoMaiuscula implements Processamento {


	public ProcessamentoMaiuscula(String p) {
		super();
	}

	@Override
	public String processar(String palavra) {
		return palavra.toUpperCase();
	}

}
