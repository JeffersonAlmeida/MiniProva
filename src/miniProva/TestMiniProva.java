package miniProva;

import excecoes.ProcessamentoException;

public class TestMiniProva {


	public static void main(String[] args) {
		
		String entrada = "Borba, Mariana C.";
		Processamento processamento = new ProcessamentoNomes();
		String saida = "";
		try {
			saida = processamento.processar(entrada);
			System.out.println("\n\nEntrada = "+ entrada + "\nsaida = " + saida);
		} catch (ProcessamentoException e) {
			e.imprimeMsg();
		}
		
		//////////////////////////////////////////////////////////////////////////////
		
		ProcessamentoArray  outroProcessamento = new ProcessamentoArray("Borba, Mariana C.");
		Processamento processamentoNomes = new ProcessamentoNomes();
		outroProcessamento.inserirObjetoProcessamento(processamentoNomes);
		String outraEntrada = "Borba, Mariana C.";
		try {
			String outraSaida = outroProcessamento.processar(outraEntrada);
			System.out.println("\n\nEntrada = "+ outraEntrada + "\nsaida = " + outraSaida);
		} catch (ProcessamentoException e) {
			e.imprimeMsg();
		}		
		
	}

}
