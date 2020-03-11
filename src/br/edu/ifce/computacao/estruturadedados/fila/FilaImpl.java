package br.edu.ifce.computacao.estruturadedados.fila;

public class FilaImpl implements Fila {

	private Integer[] fila;
	private int posicao;
	
	public FilaImpl(int tamanho) {
		fila = new Integer[tamanho];
		posicao = -1;
	}
	
	@Override
	public void insereFinal(Integer valor) {
		//Realiza as valida��es
		if (filaCheia()) {
			System.out.println("Fila Cheia. Elemento n�o inserido.");
			return;
		}
		
		fila[++posicao] = valor;
	}

	@Override
	public Integer removeInicio() {
		
		if (filaVazia()) {
			System.out.println("Fila Vazia. N�o h� elemento para remo��o.");
			return null;
		}
		
		int elementoRemovido = fila[0];
		
		for (int i = 0; i < posicao; i++) {
			fila[i] = fila[i + 1];
		}
		
		fila[posicao--] = null;
		
		
		return elementoRemovido;
	}

	@Override
	public boolean filaCheia() {
		if (posicao == fila.length - 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean filaVazia() {
		return posicao == -1 ? true : false;
	}

	@Override
	public void imprimeFila() {
		
		if (filaVazia()) {
			System.out.println("Fila Vazia. N�o h� elementos para impress�o");
			return;
		}
		
		for (int i = 0; i <= posicao; i++) {
			System.out.print(fila[i] + "\t");
		}
		System.out.println();
		
		
	}

}
