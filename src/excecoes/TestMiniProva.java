package excecoes;

import miniProva.Processamento;

public class TestMiniProva {


	public static void main(String[] args) {
		
		String entrada = "Borba, Mariana C.";
		Processamento processamento = new ProcessamentoNomes(entrada);
		String saida = "";
		try {
			saida = processamento.processar(processamento.getPalavra());
			System.out.println("\n\nEntrada = "+ entrada + "\nsaida = " + saida);
		} catch (ProcessamentoException e) {
			e.imprimeMsg();
		}
	}

}
