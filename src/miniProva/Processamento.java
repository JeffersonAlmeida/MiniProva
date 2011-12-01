package miniProva;

import excecoes.ProcessamentoException;

public interface Processamento {	
	public String processar(String palavra)throws ProcessamentoException;
}
