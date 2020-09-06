package br.edu.ifce.computacao.estruturadedados.listaduplamenteencadeada;

public class TesteListaDuplaEncadeada {
    public static void main(String[] args) {

        TADListaDuplaEncadeada<String> listaDuplaEncadeada = new ListaDuplaEncadeada<String>();

        // Inserção
        listaDuplaEncadeada.insereValor("Luiz", 1);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.insereValor("L", 2);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.insereValor("L", 0);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.insereValor("u", 3);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.insereValor("z", 5);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.insereValor("i", 4);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.insereValor("z", 5);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.insereValor("A", 3);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.insereValor("HMMM", 2);
        listaDuplaEncadeada.imprimeLista();


        // Remoção
        listaDuplaEncadeada.removeValor(3);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.removeValor(3);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.removeValor(2);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.removeValor(1);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.removeValor(0);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.removeValor(1);
        listaDuplaEncadeada.imprimeLista();

        listaDuplaEncadeada.removeValor(3);
        listaDuplaEncadeada.imprimeLista();





    }
}
