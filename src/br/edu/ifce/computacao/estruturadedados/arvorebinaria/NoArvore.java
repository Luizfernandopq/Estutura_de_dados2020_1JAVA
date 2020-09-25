package br.edu.ifce.computacao.estruturadedados.arvorebinaria;

public class NoArvore<T> {
    private T valor;
    private NoArvore<T> pai;
    private NoArvore<T> esq;
    private NoArvore<T> dir;

    public NoArvore(T valor, NoArvore<T> pai, NoArvore<T> esq, NoArvore<T> dir) {
        this.valor = valor;
        this.pai = pai;
        this.esq = esq;
        this.dir = dir;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NoArvore<T> getPai() {
        return pai;
    }

    public void setPai(NoArvore<T> pai) {
        this.pai = pai;
    }

    public NoArvore<T> getEsq() {
        return esq;
    }

    public void setEsq(NoArvore<T> esq) {
        this.esq = esq;
    }

    public NoArvore<T> getDir() {
        return dir;
    }

    public void setDir(NoArvore<T> dir) {
        this.dir = dir;
    }

}
