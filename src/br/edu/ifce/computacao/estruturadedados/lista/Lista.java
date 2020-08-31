package br.edu.ifce.computacao.estruturadedados.lista;

public class Lista<T> implements TADLista<T> {

	private T[] lista;
	private int posicao;
	
	public Lista(int tamanho) {
		lista = (T[]) new Object[tamanho];
		posicao = -1;
	}
	
	@Override
	public void adicionaValor(T valor, int indice) {
		//Realiza validacoes - verifica se tem espa�o disponivel
		if (listaCheia()) {
			System.out.println("Lista Cheia. Elemento " + valor + " n�o adicionado.");
			return;
		}
		//Verifica se o indice � v�lido
		if (indice < 0 || indice > posicao + 1) {
			System.out.println("Elemento n�o adicionado. Posicao " + indice + " inv�lida.");
			return;
		}
		
		//Desloca os elementos posteriores ao indice uma posi��o a direita 
		for (int i = posicao; i >= indice; i--) {
			lista[i + 1] = lista[i];
		}
		lista[indice] = valor;
		posicao++;
	}



	public T removePos(int indice) {
		// Realiza valida��es 
		if (listaVazia()) {
			System.out.println("Lista vazia. N�o h� elementos para remo��o");
			return null;
		}
		if (indice < 0 || indice > posicao) {
			System.out.println("Indice inv�lido. Elemento n�o removido.");
			return null;
		}
		
		T valorRemovido = lista[indice];
		
		// Desloca os elementos posteriores ao indice a esquerda
		for (int i = indice; i < posicao; i++) {
			lista[i] = lista[i + 1];
		}
		lista[posicao--] = null;
		
		return valorRemovido;
	}

	@Override
	public T set(int pos, T t) {
		T t1 = removePos(pos);
		adicionaValor(t, pos);
		return t1;
	}

	@Override
	public void addPrimeiro(T t) {
		adicionaValor(t, 0);
	}

	@Override
	public void addUltimo(T t) {
		adicionaValor(t, posicao+1);
	}

	@Override
	public void addAntes(int pos, T t) {
		adicionaValor(t, pos - 1);
	}

	@Override
	public void addDepois(int pos, T t) {
		adicionaValor(t, pos + 1);
	}

	@Override
	public void removeValor(T t) {
		for(int i=0; i <= posicao; i++){
			if(lista[i] == t){
				removePos(i);
				i--;
			}
		}
	}

	public boolean listaCheia() {
		return posicao == lista.length - 1;
	}

	public boolean listaVazia() {
		return posicao == -1;
	}

	
	public void imprimeLista() {
		
		for (int i = 0; i <= posicao; i++) {
			System.out.print(lista[i] + "\t");
		}
		System.out.println();
	
	}

	@Override
	public T first() {
		return lista[0];
	}

	@Override
	public T last() {
		return lista[posicao];
	}

	@Override
	public T anterior(int pos) {
		if (pos < 1 || pos > posicao) {
			System.out.println("Indice inv�lido. Elemento n�o retornado.");
			return null;
		}
		return lista[pos-1];
	}

	@Override
	public T posterior(int pos) {
		if (pos < -1 || pos >= posicao) {
			System.out.println("Indice inv�lido. Elemento n�o retornado.");
			return null;
		}
		return lista[pos+1];

	}

}
