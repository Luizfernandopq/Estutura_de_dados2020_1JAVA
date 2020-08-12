package br.edu.ifce.computacao.estruturadedados.fila;

/**
 * TAD (Tipo Abstrato de Dados) Fila
 * 
 * @author Thiago Queiroz (thiago.queiroz@ifce.edu.br)
 * 
 * @since 19/02/2020
 * 
 * @version 1.0 
 *
 */
public interface Fila {
	
	/**
	 * Opera��es b�sicas
	 *
	 */
	public void insereFinal(Integer valor);
	public Integer removeInicio();

	/**
	 * Opera��es auxiliares
	 */
	public boolean filaCheia();
	public boolean filaVazia();
	
	public void imprimeFila();
}
