package br.edu.ifce.computacao.estruturadedados.listaduplamenteencadeada;

public class ListaDuplaEncadeada<T> implements TADListaDuplaEncadeada<T> {

    private No<T> header, trailer;
    private int tamanho;


    public ListaDuplaEncadeada(){
        header = new No(null,null, null);
        trailer = new No(header, null, null);
        header.setPosterior(trailer);
        tamanho = 0;


    }


    @Override
    public void insereValor(T valor, int posicao) {
        //Validações
        if(posicao < 1 || posicao > tamanho + 1){
            System.out.println("Posição inválida para inserção: "+ posicao);
            return;
        }
        No<T> noAntInsercao = header;

        for (int i = 1; i < posicao; i++){
            noAntInsercao = noAntInsercao.getPosterior();
        }

        No<T> novoNo = new No(noAntInsercao, valor, noAntInsercao.getPosterior());
        noAntInsercao.getPosterior().setAnterior(novoNo);
        noAntInsercao.setPosterior(novoNo);
        tamanho++;
    }

    @Override
    public T removeValor(int posicao) {
        //Validações
        if(posicao < 1 || posicao > tamanho){
            System.out.println("Posição inválida para remoção: "+ posicao);
            return null;
        }
        No<T> noAntRemocao = header;
        for (int i = 1; i < posicao; i++){
            noAntRemocao = noAntRemocao.getPosterior();
        }
        No<T> noRemovido = noAntRemocao.getPosterior();
        noAntRemocao.setPosterior(noRemovido.getPosterior());
        noRemovido.getPosterior().setAnterior(noAntRemocao);

        noRemovido.setAnterior(null);
        noRemovido.setPosterior(null);
        tamanho--;
        return noRemovido.getValor();
    }

    @Override
    public boolean isListaVazia() {
        return tamanho < 1;
    }

    @Override
    public void imprimeLista() {
        if(isListaVazia()){
            System.out.println("Lista Vazia");
            return;
        }
        No<T> noAux = header;
        while (noAux.getPosterior() != null){
            System.out.print(noAux.getValor() + " <=> ");
            noAux = noAux.getPosterior();
        }
        System.out.println(noAux.getValor() + " \n ");
    }
}
