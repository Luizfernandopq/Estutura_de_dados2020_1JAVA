package br.edu.ifce.computacao.estruturadedados.arvorebinariadebusca;

public class ArvoreBinariaBusca {

    private BTSNode raiz;

    public BTSNode getRaiz() {
        return raiz;
    }

    public void insereNo(Integer valor, BTSNode noBase){
        if (raiz == null){
            raiz = new BTSNode(valor, null, null, null);
            return;
        }
        if (valor == noBase.getValor()){
            System.out.println("Nó já inserido");
        } else if (valor > noBase.getValor()){
            if (noBase.getDir() == null) {
                BTSNode novoNo = new BTSNode(valor, noBase, null, null);
                noBase.setDir(novoNo);
            } else {
                insereNo(valor, noBase.getDir());
            }
        } else if (valor < noBase.getValor()){
            if (noBase.getEsq() == null) {
                BTSNode novoNo = new BTSNode(valor, noBase, null, null);
                noBase.setEsq(novoNo);
            } else {
                insereNo(valor, noBase.getEsq());
            }
        }
    }
    public BTSNode removeNo(Integer valor, BTSNode noBase){
        if (noBase == null){
            System.out.println("Elemento não encontrado");
            return null;
        }
        BTSNode novoNo = new BTSNode(valor, null, null, null);
        if (noBase.getValor() == valor){
            if (isFolha(noBase)){
                return ejetaNoFolha(noBase);
            } else {
                BTSNode noAux;
                if(noBase.getDir() != null){
                    noAux = noBase.getDir();
                    while (noAux.getEsq() != null){
                        noAux = noAux.getEsq();
                    }
                }else {
                    noAux = noBase.getEsq();
                    while (noAux.getDir() != null){
                        noAux = noAux.getDir();
                    }
                }
                noBase.setValor(noAux.getValor());
                removeNo(noAux.getValor(), noAux);
                return novoNo;
            }
        }else if(valor < noBase.getValor()){
            return removeNo(valor, noBase.getEsq());
        }else{
            return removeNo(valor, noBase.getDir());
        }
    }
    public BTSNode ejetaNoFolha(BTSNode no){
        Integer valor = no.getValor();
        BTSNode noPai = no.getPai();
        if (noPai.getEsq() != null && noPai.getEsq().getValor() == valor){
            noPai.setEsq(null);
        }
        if (noPai.getDir() != null && noPai.getDir().getValor() == valor){
            noPai.setDir(null);
        }
        no.setPai(null);
        return no;
    }


    public BTSNode pesquisaNo(Integer valor,BTSNode noBase){
        if(noBase == null){
            return null;
        }
        if (valor == noBase.getValor()){
            return noBase;
        }
        if (valor < noBase.getValor()){
            return pesquisaNo(valor, noBase.getEsq());
        }
        else{
            return pesquisaNo(valor, noBase.getDir());
        }
    }

    public int profundidade(BTSNode noBase){
        if (noBase == null || noBase.equals(raiz)){
            return 0;
        } else {
            return profundidade(noBase.getPai()) + 1;
        }
    }
    public int alturaNo(BTSNode noBase){
        if (noBase == null || isFolha(noBase)){
            return 0;
        } else {
            return Math.max(alturaNo(noBase.getEsq()),alturaNo(noBase.getDir())) + 1;
        }
    }

    public boolean isFolha(BTSNode no){
        return no.getEsq() == null && no.getDir() == null;
    }


    public void imprimirPrefixado(BTSNode noBase) {
        if (noBase != null) {
            System.out.print(noBase.getValor() + "\t");
            imprimirPrefixado(noBase.getEsq());
            imprimirPrefixado(noBase.getDir());
        }

    }

    public void imprimirInterfixado(BTSNode noBase) {
        if (noBase != null) {
            imprimirInterfixado(noBase.getEsq());
            System.out.print(noBase.getValor() + "\t");
            imprimirInterfixado(noBase.getDir());
        }
    }

    public void imprimirPosfixado(BTSNode noBase) {
        if (noBase != null) {
            imprimirPosfixado(noBase.getEsq());
            imprimirPosfixado(noBase.getDir());
            System.out.print(noBase.getValor() + "\t");
        }
    }


}
