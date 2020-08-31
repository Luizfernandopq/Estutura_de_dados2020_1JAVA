package br.edu.ifce.computacao.estruturadedados.lista;

/**
 * TAD Lista
 */
public interface TADLista<T> {
	
	//Metodos principais
	public void adicionaValor(T valor, int indice);
	public T removePos(int indice);
	public abstract T set(int pos, T t);
	public abstract void addPrimeiro (T t);
	public abstract void addUltimo (T t);
	public abstract void addAntes (int pos, T t);
	public abstract void addDepois (int pos, T t);

	public abstract void removeValor(T t);




	//Metodos secundarios
	public boolean listaCheia();
	public boolean listaVazia();
	public void imprimeLista();

	public abstract T first();
	public abstract T last();
	public abstract T anterior(int pos);
	public abstract T posterior(int pos);
	
}
