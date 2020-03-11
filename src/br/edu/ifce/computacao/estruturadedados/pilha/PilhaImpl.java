package br.edu.ifce.computacao.estruturadedados.pilha;

/**
 * Implementa��o da pilha utiliza��o vetor
 * Considera-se o topo da pilha o �ndice 0 do vetor
 * 
 * @author Thiago Queiroz (thiago.queiroz@ifce.edu.br)
 *
 */
public class PilhaImpl implements Pilha {
	
	private Integer[] pilha;
	private int posicao;
	
	public PilhaImpl(int tamanho) {
		pilha = new Integer[tamanho];
		posicao = -1;
	}

	public void adicionaTopo(Integer valor) {
		if (pilhaCheia()) {
			System.out.println("Pilha Cheia. Elemento n�o adicionado.");
			return;
		}
		//Deslocar todos os valores uma posi��o a direita
		for (int i = posicao; i >= 0; i--) {
			pilha[i + 1] = pilha[i];
		}
		pilha[0] = valor;
		posicao++;
		
	}

	public Integer removeTopo() {
		if(pilhaVazia()) {
			System.out.println("Pilha Vazia. N�o h� elemetos para remo��o.");
			return null;
		}
		
		int valorRemovido = pilha[0];
		//Desloca todos os valores uma posi��o a esquerda
		for (int i = 0; i < posicao; i++) {
			pilha[i] = pilha[i + 1];
		}
		pilha[posicao--] = null;
		
		return valorRemovido;
	}

	@Override
	public boolean pilhaCheia() {
		if (posicao == pilha.length - 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean pilhaVazia() {
		if (posicao == -1) {
			return true;
		}
		return false;
	}

	public void imprime() {
		if (pilhaVazia()) {
			System.out.println("Pilha Vazia. N�o h� elementos para impress�o.");
			return;
		}
		for (int i = 0; i <= posicao; i++) {
			System.out.print(pilha[i] + "\t");
		}
		System.out.println();
		
	}

}
