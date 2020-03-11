package br.edu.ifce.computacao.estruturadedados.pilha;

public interface Pilha {
	
	/**
	 * Opera��es principais
	 */
	public void adicionaTopo(Integer valor);
	public Integer removeTopo();
	
	/**
	 * Opera��es secund�rias
	 */
	public boolean pilhaCheia();
	public boolean pilhaVazia();
	public void imprime();

}
