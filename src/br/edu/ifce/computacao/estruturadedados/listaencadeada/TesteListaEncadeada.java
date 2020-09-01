package br.edu.ifce.computacao.estruturadedados.listaencadeada;

public class TesteListaEncadeada {


	public static void main(String[] args) {
		/*
		* Lista encadeada STRING
		* */
		TADListaEncadeada<String> listaEncadeadaStr = new ListaEncadeada<String>();

		listaEncadeadaStr.imprimeLista();

		listaEncadeadaStr.insereInicio("Luiz");
		listaEncadeadaStr.imprimeLista();

		listaEncadeadaStr.insereFinal("Klayver");
		listaEncadeadaStr.imprimeLista();

		listaEncadeadaStr.inserePosicao("Walber", 1);
		listaEncadeadaStr.imprimeLista();

		listaEncadeadaStr.inserePosicao("Migué", 2);
		listaEncadeadaStr.imprimeLista();

		listaEncadeadaStr.removeChar('i');
		listaEncadeadaStr.imprimeLista();

		/*
		 * Lista encadeada INTEGER
		 * */
		TADListaEncadeada<Integer> listaEncadeadaInt = new ListaEncadeada<Integer>();
		listaEncadeadaInt.insereOrdenado(3);
		listaEncadeadaInt.imprimeLista();

		listaEncadeadaInt.insereOrdenado(2);
		listaEncadeadaInt.imprimeLista();

		listaEncadeadaInt.insereOrdenado(4);
		listaEncadeadaInt.imprimeLista();

		listaEncadeadaInt.insereOrdenado(1);
		listaEncadeadaInt.imprimeLista();

		listaEncadeadaInt.insereOrdenado(5);
		listaEncadeadaInt.imprimeLista();


//		TADListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();
//		listaEncadeada.inserePosicao(18, 3);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.inserePosicao(16, 3);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.inserePosicao(22, 6);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.inserePosicao(22, 8);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.inserePosicao(22, -1);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.inserePosicao(8, 0);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.removePosicao(0);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.removePosicao(0);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.removePosicao(6);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.removePosicao(5);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.removePosicao(2);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.removePosicao(-1);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.removePosicao(4);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.removePosicao(3);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.removePosicao(1);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.removePosicao(0);
//		listaEncadeada.imprimeLista();
//
//		listaEncadeada.removePosicao(0);
//		listaEncadeada.imprimeLista();
	}


}
