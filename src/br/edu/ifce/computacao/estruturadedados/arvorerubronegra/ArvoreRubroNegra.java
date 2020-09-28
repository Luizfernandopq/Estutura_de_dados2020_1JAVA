package br.edu.ifce.computacao.estruturadedados.arvorerubronegra;


public class ArvoreRubroNegra {
    private NoRubro raiz;

    public NoRubro getRaiz() {
        return raiz;
    }

    public NoRubro insereNo(Integer valor, NoRubro noBase) {
        //Caso 1 (o nó a ser inserido é o raiz.Portanto, será da cor preta)
        if (raiz == null) {
            raiz = new NoRubro(valor, null, null, null, false);
            return raiz;
        }
        if (valor == noBase.getValor()) {
            System.out.println("Nó já inserido");
            return null;
        } else {
            NoRubro noInserido;
            if (valor > noBase.getValor()) {
                if (noBase.getDir() == null) {
                    NoRubro novoNo = new NoRubro(valor, noBase, null, null, true);
                    noBase.setDir(novoNo);
                    return novoNo;
                } else {
                    noInserido = insereNo(valor, noBase.getDir());
                }
            } else {
                if (noBase.getEsq() == null) {
                    NoRubro novoNo = new NoRubro(valor, noBase, null, null, true);
                    noBase.setEsq(novoNo);
                    return novoNo;
                } else {
                    noInserido = insereNo(valor, noBase.getEsq());
                }
            }
            if (noInserido != null) {
                fixCaso1(noInserido);
            }
            return noInserido;
        }
    }

    private void fixCaso1(NoRubro n) {
        if (n.getPai() == null) {
            n.setRubro(false);
        } else {
            fixCaso2(n);
        }
    }

    private void fixCaso2(NoRubro n) {
        if (n.getPai().isRubro()) {
            fixCaso3(n);
        }
    }

    private void fixCaso3(NoRubro n) {
        NoRubro tio = n.getTio();
        if (tio != null && tio.isRubro()) {
            NoRubro pai = n.getPai();
            pai.setRubro(false);
            tio.setRubro(false);
            NoRubro avo = pai.getPai();
            avo.setRubro(true);
            fixCaso1(avo);
        } else {
            fixCaso4(n);
        }
    }

    private void fixCaso4(NoRubro n) {
        NoRubro pai = n.getPai();
        NoRubro avo = n.getAvo();
        if (n.isHigher(pai) && avo.isHigher(pai)) {
            rotacaoAEsquerda(n);

            n = n.getEsq();
        } else if (pai.isHigher(n) && pai.isHigher(avo)) {
            rotacaoADireita(n);

            n = n.getDir();
        }
        fixCaso5(n);
    }

    private void fixCaso5(NoRubro n) {
        NoRubro avo = n.getAvo();
        NoRubro pai = n.getPai();

        avo.setRubro(true);
        pai.setRubro(false);
        if (pai.isHigher(n) && avo.isHigher(pai)) {
            rotacaoADireita(pai);
        } else {
            rotacaoAEsquerda(pai);
        }
    }


    public void insereNo(Integer valor) {
        insereNo(valor, getRaiz());
    }

    private void rotacaoAEsquerda(NoRubro noFilho) {
        NoRubro pai = noFilho.getPai();
        System.out.println("rotação à esquerda: " + pai.getValor());
        if (pai == raiz) {
            System.out.println("trocando a raiz...");
            raiz = noFilho;
        }
        pai.setDir(noFilho.getEsq());
        if (pai.getDir() != null) {
            pai.getDir().setPai(pai);
        }
        noFilho.setEsq(pai);
        noFilho.setPai(pai.getPai());
        if (noFilho.getPai() != null) {
            if (noFilho.getPai().isHigher(noFilho)) {
                noFilho.getPai().setEsq(noFilho);
            } else {
                noFilho.getPai().setDir(noFilho);
            }
        }
        pai.setPai(noFilho);
    }

    private void rotacaoADireita(NoRubro noFilho) {
        NoRubro pai = noFilho.getPai();
        System.out.println("rotação d: " + pai.getValor());
        if (pai == raiz) {
            System.out.println("trocando a raiz");
            raiz = noFilho;
        }
        pai.setEsq(noFilho.getDir());
        if (pai.getEsq() != null) {
            pai.getEsq().setPai(pai);
        }
        noFilho.setDir(pai);
        noFilho.setPai(pai.getPai());
        if (noFilho.getPai() != null) {
            if (noFilho.getPai().isHigher(noFilho)) {
                noFilho.getPai().setEsq(noFilho);
            } else {
                noFilho.getPai().setDir(noFilho);
            }
        }
        pai.setPai(noFilho);
    }

    public NoRubro pesquisaValor(Integer valor, NoRubro noBase) {
        if (noBase == null) {
            return null;
        }
        if (valor == noBase.getValor()) {
            return noBase;
        }
        if (valor < noBase.getValor()) {
            return pesquisaValor(valor, noBase.getEsq());
        } else {
            return pesquisaValor(valor, noBase.getDir());
        }
    }

    public NoRubro pesquisaValor(Integer valor) {
        return pesquisaValor(valor, getRaiz());
    }

    public void imprimirInterfixado() {
        System.out.println(raiz.getValor() + " é a raiz");
        imprimirInterfixado(raiz);
    }

    public void imprimirInterfixado(NoRubro noBase) {
        if (noBase != null) {
            imprimirInterfixado(noBase.getEsq());
            System.out.print(noBase.getValor() + " " + noBase.getCor() + "\t");
            imprimirInterfixado(noBase.getDir());
        }
    }

    public NoRubro removeValor(Integer valor){
        return removeValor(valor, raiz);
    }

    public NoRubro removeValor(Integer valor, NoRubro noBase){
        NoRubro noRemovido = pesquisaValor(valor,noBase);
        if (noRemovido == null){
            System.out.println("Elemento não encontrado");
            return null;
        }
        if (noRemovido.getValor() == valor){
            if (isFolha(noRemovido)){
                return ejetaNoFolha(noRemovido);
            } else {
                NoRubro noSucessor;
                if(noRemovido.getDir() != null){
                    noSucessor = noRemovido.getDir();
                    while (noSucessor.getEsq() != null){
                        noSucessor = noSucessor.getEsq();
                    }
                }else {
                    noSucessor = noRemovido.getEsq();
                    while (noSucessor.getDir() != null){
                        noSucessor = noSucessor.getDir();
                    }
                }
                noRemovido.setValor(noSucessor.getValor());
                removeValor(noSucessor.getValor(), noSucessor);
                return noRemovido;
            }
        }else{
            System.out.println("Erro");
            return null;
        }
    }
    public boolean isFolha(NoRubro no){
        return no.getEsq() == null && no.getDir() == null;
    }

    public NoRubro ejetaNoFolha(NoRubro no){
        Integer valor = no.getValor();
        NoRubro noPai = no.getPai();
        if (noPai.getEsq() != null && noPai.getEsq().getValor() == valor){
            noPai.setEsq(null);
        }
        if (noPai.getDir() != null && noPai.getDir().getValor() == valor){
            noPai.setDir(null);
        }
        no.setPai(null);
        if (no == raiz){
            raiz = null;
        }
        return no;
    }

}
