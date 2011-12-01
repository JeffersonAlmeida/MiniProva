package excecoes;

import java.util.ArrayList;
import java.util.Iterator;

import miniProva.Processamento;

public class ProcessamentoArray extends Processamento{

	private ArrayList<Processamento> processamentos;
	
	public ProcessamentoArray(String p) {
		super(p);
		this.processamentos = new ArrayList<>();
	}
	
	@Override
	public String processar(String palavra) throws ProcessamentoException{		
		Iterator<Processamento> i = this.processamentos.iterator();
		String saida = "";
		while (i.hasNext()) {
			Processamento processamento = (Processamento) i.next();		
			saida = processamento.processar(palavra);
		}		
		return saida;
	}

	public ArrayList<Processamento> getProcessamentos() {
		return processamentos;
	}

	public void setProcessamentos(ArrayList<Processamento> processamentos) {
		this.processamentos = processamentos;
	}
	
	public void inserirObjetoProcessamento(Processamento processamento){
		this.processamentos.add(processamento);
	}
	
	public static void main(String[] args) {
		
		ProcessamentoArray  processamento = new ProcessamentoArray("Borba, Mariana C.");
		Processamento processamentoNomes = new ProcessamentoNomes("");
		processamento.inserirObjetoProcessamento(processamentoNomes);
		String entrada = "Borba, Mariana C.";
		try {
			String saida = processamento.processar(entrada);
			System.out.println("\n\nEntrada = "+ entrada + "\nsaida = " + saida);
		} catch (ProcessamentoException e) {
			e.imprimeMsg();
		}		
	}
}
