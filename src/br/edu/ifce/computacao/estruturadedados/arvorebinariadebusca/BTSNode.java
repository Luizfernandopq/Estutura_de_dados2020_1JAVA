package br.edu.ifce.computacao.estruturadedados.arvorebinariadebusca;

public class BTSNode {
    private Integer valor;
    private BTSNode pai, esq, dir;

    public BTSNode(Integer valor, BTSNode pai, BTSNode esq, BTSNode dir) {
        this.valor = valor;
        this.pai = pai;
        this.esq = esq;
        this.dir = dir;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public BTSNode getPai() {
        return pai;
    }

    public void setPai(BTSNode pai) {
        this.pai = pai;
    }

    public BTSNode getEsq() {
        return esq;
    }

    public void setEsq(BTSNode esq) {
        this.esq = esq;
    }

    public BTSNode getDir() {
        return dir;
    }

    public void setDir(BTSNode dir) {
        this.dir = dir;
    }
}
