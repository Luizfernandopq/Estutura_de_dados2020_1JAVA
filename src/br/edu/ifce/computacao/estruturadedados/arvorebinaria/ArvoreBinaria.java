package br.edu.ifce.computacao.estruturadedados.arvorebinaria;

public class ArvoreBinaria<T> {
    private NoArvore<T> raiz;

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public ArvoreBinaria(){
        raiz = null;
    }
    /*
    * Operações Principais
    * */

    public NoArvore<T> insereRaiz(T valor){
        if (raiz != null){
            System.out.println("Já tem raiz");
            return null;
        }
        raiz = new NoArvore<T>(valor, null, null, null);
        return raiz;
    }

    public NoArvore<T> insereEsquerda(T valor, NoArvore<T> noBase){
        if (noBase == null){
            System.out.println("Nó inexistente");
            return null;
        }
        if (noBase.getEsq() != null) {
            System.out.println("Nó esquerdo já existe");
            return null;
        }

        NoArvore<T> novoNo = new NoArvore<T>(valor, noBase, null, null);
        noBase.setEsq(novoNo);
        return novoNo;
    }



    public NoArvore<T> insereDireita(T valor, NoArvore<T> noBase){
        if (noBase == null){
            System.out.println("Nó inexistente");
            return null;
        }
        if (noBase.getDir() != null) {
            System.out.println("Nó direito já existe");
            return null;
        }

        NoArvore<T> novoNo = new NoArvore<T>(valor, noBase, null, null);
        noBase.setDir(novoNo);
        return novoNo;
    }

    public void imprimirPrefixado(NoArvore<T> noBase) {
        if (noBase != null) {
            System.out.print(noBase.getValor() + "\t");
            imprimirPrefixado(noBase.getEsq());
            imprimirPrefixado(noBase.getDir());
        }

    }

    public void imprimirInterfixado(NoArvore<T> noBase) {
        if (noBase != null) {
            imprimirInterfixado(noBase.getEsq());
            System.out.print(noBase.getValor() + "\t");
            imprimirInterfixado(noBase.getDir());
        }
    }

    public void imprimirPosfixado(NoArvore<T> noBase) {
        if (noBase != null) {
            imprimirPosfixado(noBase.getEsq());
            imprimirPosfixado(noBase.getDir());
            System.out.print(noBase.getValor() + "\t");
        }
    }
}
