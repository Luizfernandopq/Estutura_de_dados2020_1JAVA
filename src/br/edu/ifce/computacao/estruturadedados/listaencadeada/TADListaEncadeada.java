package br.edu.ifce.computacao.estruturadedados.listaencadeada;

import java.util.List;

/**
 * TAD (Tipo Abstrato de Dados) para representar a Lista Encadeada
 * 
 * @author Thiago Queiroz (thiago.queiroz@ifce.edu.br)
 *
 * @param <T>
 */
public interface TADListaEncadeada<T> {

	/**
	 * Operacoes principais
	 */
	public void insereInicio(T valor);
	public void inserePosicao(T valor, int posicao);
	public void insereFinal(T valor);
	
	public T removePosicao(int posicao);
	
	/**
	 * Operacoes secundarias
	 */
	public boolean listaVazia();
	public void imprimeLista();
	public void removeChar(Character c);
	public void insereOrdenado(T valor);


}
