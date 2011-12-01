package miniProva;

import java.util.Iterator;

import excecoes.ProcessamentoException;


public class ProcessamentoNomes implements Processamento{

	public ProcessamentoNomes() {
		super();
	}
	
	// "Borba, Mariana C."  -> "Mariana C. Borba"
	// "Nome, Nomes" -> lancar excessao caso nao esteja neste parametro.
	// Borba, 
	// Mariana
	// C.
	@Override
	public String processar(String palavra)throws ProcessamentoException{	
		String resultadoNome = "";	
		if(estaNoFormato(palavra)){
			String[] nomes = palavra.split(" ");
			String primeiroNome = (String) nomes[0].subSequence(0, (nomes[0].length()-1));
			int i = 1;
			while (i<nomes.length) {
				resultadoNome = resultadoNome + nomes[i] + " ";
				i++;
			}
			resultadoNome = resultadoNome + primeiroNome;
		}else{
			throw new ProcessamentoException(palavra);
		}
		return resultadoNome;
	}
	
	public boolean estaNoFormato(String palavra){
		String[] nomes = palavra.split(" ");
		String primeiroNome = nomes[0];
		char[] arrayCaracteres = primeiroNome.toCharArray();		
		char ultimoCaracter = arrayCaracteres[primeiroNome.length()-1];
		if((ultimoCaracter==',')&&(nomes.length>1)){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
	}

}
