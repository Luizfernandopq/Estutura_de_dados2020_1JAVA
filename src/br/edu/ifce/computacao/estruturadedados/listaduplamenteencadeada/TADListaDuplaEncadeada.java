package br.edu.ifce.computacao.estruturadedados.listaduplamenteencadeada;

public interface TADListaDuplaEncadeada<T> {
    /*
     * Operações principais
     * */
    void insereValor(T valor, int posicao);
    T removeValor(int posicao);

    /*
     * Operações secundárias
     * */
    boolean isListaVazia();
    void imprimeLista();





}
