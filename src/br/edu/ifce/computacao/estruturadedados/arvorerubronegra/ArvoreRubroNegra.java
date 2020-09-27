package br.edu.ifce.computacao.estruturadedados.arvorerubronegra;



public class ArvoreRubroNegra {
    private NoRubro raiz;

    public NoRubro getRaiz() {
        return raiz;
    }

    public void insereNo(Integer valor, NoRubro noBase){
        if (raiz == null){
            raiz = new NoRubro(valor, null, null, null, false);
            return;
        }
        if (valor == noBase.getValor()){
            System.out.println("Nó já inserido");
        } else if (valor > noBase.getValor()){
            if (noBase.getDir() == null) {
                NoRubro novoNo = new NoRubro(valor, noBase, null, null, true);
                noBase.setDir(novoNo);
            } else {
                insereNo(valor, noBase.getDir());
            }
        } else if (valor < noBase.getValor()){
            if (noBase.getEsq() == null) {
                NoRubro novoNo = new NoRubro(valor, noBase, null, null, true);
                noBase.setEsq(novoNo);
            } else {
                insereNo(valor, noBase.getEsq());
            }
        }
    }
    public void insereNo(Integer valor){
        insereNo(valor, getRaiz());
    }

    public NoRubro pesquisaNo(Integer valor, NoRubro noBase){
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

    public NoRubro pesquisaNo(Integer valor){
        return pesquisaNo(valor, getRaiz());
    }


}
