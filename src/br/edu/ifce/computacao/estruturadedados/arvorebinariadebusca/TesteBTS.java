package br.edu.ifce.computacao.estruturadedados.arvorebinariadebusca;

public class TesteBTS {
    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        arvore.insereNo(20, arvore.getRaiz());
        arvore.insereNo(30, arvore.getRaiz());
        arvore.insereNo(10, arvore.getRaiz());
        arvore.insereNo(15, arvore.getRaiz());
        arvore.insereNo(25, arvore.getRaiz());

        arvore.imprimirInterfixado(arvore.getRaiz());

        System.out.println("\nAltura da raiz: "+ arvore.alturaNo(arvore.getRaiz()));
        System.out.println("Profundidade da raiz: "+ arvore.profundidade(arvore.getRaiz()));

        BTSNode noPesquisado = arvore.pesquisaNo(15, arvore.getRaiz());
        if(noPesquisado != null){
            System.out.println("\nAltura do nó: "+ arvore.alturaNo(noPesquisado));
            System.out.println("Prfundidade do nó: "+ arvore.profundidade(noPesquisado));
        }else{
            System.out.println("Nó não encontrado");
        }

        System.out.println("");
        arvore.removeNo(15, arvore.getRaiz());
        arvore.imprimirInterfixado(arvore.getRaiz());

        System.out.println("");
        arvore.removeNo(25, arvore.getRaiz());
        arvore.imprimirInterfixado(arvore.getRaiz());

    }
}
