package br.edu.ifce.computacao.estruturadedados.listaencadeada;

public class TesteListaEncadeada {
	
	public static void main(String[] args) {
		
		TADListaEncadeada<String> listaEncadeada = new ListaEncadeada<String>();
		
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereInicio("Luiz");
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereFinal("Klayver");
		listaEncadeada.imprimeLista();
		
		listaEncadeada.inserePosicao("Walber", 1);
		listaEncadeada.imprimeLista();
		
		listaEncadeada.inserePosicao("Migué", 2);
		listaEncadeada.imprimeLista();
		
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
		
		listaEncadeada.removeChar('i');
		listaEncadeada.imprimeLista();
	}
	
}
